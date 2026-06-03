class Solution {
    public int solution(int slice, int n) {
        int answer=0;
        while(n>0){
            answer+=1;
            n=n-slice;
        }
        return answer;
    }
}