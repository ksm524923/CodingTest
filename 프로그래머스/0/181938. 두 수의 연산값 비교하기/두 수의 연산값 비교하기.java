class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int attach= Integer.parseInt(a+""+b);
        if(attach<2*a*b){
            answer=2*a*b;
        } else{
            answer=attach;
        }
        return answer;
    }
}