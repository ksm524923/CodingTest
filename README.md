# CodingTest

[BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub)로 자동 업로드한 프로그래머스 풀이 저장소입니다.

## 폴더 구조

풀이 파일은 언어별로 나누고, 각 언어 폴더 안에서는 난이도와 문제 순서로 정리합니다.

```text
프로그래머스/
├── Java/
├── Python/
├── C++/
├── JavaScript/
└── SQL/
    └── {난이도}/{문제 번호. 문제 이름}/
```

현재 풀이 수:

- Java: 125개
- Python: 8개
- JavaScript: 3개
- C++: 0개
- SQL: 9개

## 자동 언어 분류

BaekjoonHub가 새 풀이를 `프로그래머스/{난이도}`에 올리면 GitHub Actions가 확장자를 확인해 알맞은 언어 폴더로 이동합니다.

| 확장자 | 언어 폴더 |
| --- | --- |
| `.java` | `Java` |
| `.py` | `Python` |
| `.cpp`, `.cc`, `.cxx` | `C++` |
| `.js` | `JavaScript` |
| `.sql` | `SQL` |
