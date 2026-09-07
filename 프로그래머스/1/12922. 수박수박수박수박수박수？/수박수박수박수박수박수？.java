class Solution {
    public String solution(int n) {
        String answer = "";
        char A='수';
        char B='박';
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                answer+=A;
            } else{
                answer+=B;
            }
        }
        return answer;
    }
}