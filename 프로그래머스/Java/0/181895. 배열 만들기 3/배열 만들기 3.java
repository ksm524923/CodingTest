import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0], b1 = intervals[0][1];
        int a2 = intervals[1][0], b2 = intervals[1][1];
    
        int[] first = Arrays.copyOfRange(arr, a1, b1 + 1);
        int[] second = Arrays.copyOfRange(arr, a2, b2 + 1);
        
        // 2. 두 배열을 합칠 결과 배열을 생성합니다.
        int[] answer = new int[first.length + second.length];
        
        System.arraycopy(first, 0, answer, 0, first.length);
        System.arraycopy(second, 0, answer, first.length, second.length);
        
        return answer;
    }
}