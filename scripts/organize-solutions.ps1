[CmdletBinding()]
param()

$ErrorActionPreference = 'Stop'

$repositoryRoot = (Resolve-Path -LiteralPath (Join-Path $PSScriptRoot '..')).Path
$programmersRoot = Join-Path $repositoryRoot '프로그래머스'

if (-not (Test-Path -LiteralPath $programmersRoot)) {
    Write-Output '프로그래머스 폴더가 없어 정리할 파일이 없습니다.'
    exit 0
}

$languageByExtension = @{
    '.java' = 'Java'
    '.py'   = 'Python'
    '.cpp'  = 'C++'
    '.cc'   = 'C++'
    '.cxx'  = 'C++'
    '.js'   = 'JavaScript'
    '.sql'  = 'SQL'
}

$movedCounts = @{}
foreach ($language in ($languageByExtension.Values | Sort-Object -Unique)) {
    $movedCounts[$language] = 0
}

$levelDirectories = @(
    Get-ChildItem -LiteralPath $programmersRoot -Directory |
        Where-Object { $_.Name -match '^\d+$' }
)

foreach ($levelDirectory in $levelDirectories) {
    $solutionFiles = @(
        Get-ChildItem -LiteralPath $levelDirectory.FullName -Recurse -File |
            Where-Object { $languageByExtension.ContainsKey($_.Extension.ToLowerInvariant()) }
    )

    $processedProblemDirectories = @{}

    foreach ($solutionFile in $solutionFiles) {
        $extension = $solutionFile.Extension.ToLowerInvariant()
        $language = $languageByExtension[$extension]
        $problemDirectory = $solutionFile.Directory
        $processedProblemDirectories[$problemDirectory.FullName] = $problemDirectory.FullName

        $relativeProblemPath = [System.IO.Path]::GetRelativePath(
            $levelDirectory.FullName,
            $problemDirectory.FullName
        )

        $destinationDirectory = Join-Path $programmersRoot $language
        $destinationDirectory = Join-Path $destinationDirectory $levelDirectory.Name
        $destinationDirectory = Join-Path $destinationDirectory $relativeProblemPath
        New-Item -ItemType Directory -Path $destinationDirectory -Force | Out-Null

        $readmePath = Join-Path $problemDirectory.FullName 'README.md'
        if (Test-Path -LiteralPath $readmePath) {
            Copy-Item -LiteralPath $readmePath -Destination (Join-Path $destinationDirectory 'README.md') -Force
        }

        $destinationFile = Join-Path $destinationDirectory $solutionFile.Name
        Move-Item -LiteralPath $solutionFile.FullName -Destination $destinationFile -Force
        $movedCounts[$language]++
    }

    foreach ($problemDirectoryPath in $processedProblemDirectories.Values) {
        if (-not (Test-Path -LiteralPath $problemDirectoryPath)) {
            continue
        }

        $remainingItems = @(Get-ChildItem -LiteralPath $problemDirectoryPath -Force)
        $itemsExceptReadme = @($remainingItems | Where-Object { $_.Name -ne 'README.md' })

        if ($itemsExceptReadme.Count -eq 0) {
            $readmePath = Join-Path $problemDirectoryPath 'README.md'
            if (Test-Path -LiteralPath $readmePath) {
                Remove-Item -LiteralPath $readmePath
            }

            Remove-Item -LiteralPath $problemDirectoryPath
        }
    }

    if (Test-Path -LiteralPath $levelDirectory.FullName) {
        $emptyDirectories = @(
            Get-ChildItem -LiteralPath $levelDirectory.FullName -Recurse -Directory |
                Sort-Object { $_.FullName.Length } -Descending
        )

        foreach ($emptyDirectory in $emptyDirectories) {
            if ((Get-ChildItem -LiteralPath $emptyDirectory.FullName -Force).Count -eq 0) {
                Remove-Item -LiteralPath $emptyDirectory.FullName
            }
        }

        if ((Get-ChildItem -LiteralPath $levelDirectory.FullName -Force).Count -eq 0) {
            Remove-Item -LiteralPath $levelDirectory.FullName
        }
    }
}

foreach ($language in ($movedCounts.Keys | Sort-Object)) {
    Write-Output ("{0}: {1}개 이동" -f $language, $movedCounts[$language])
}
