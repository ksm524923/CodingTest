class Solution {
    public int[] solution(int n) {
        if(n%2==0){
            int[] answer = new int[n/2];
            int a=0;
            for(int i=1;i<=n;i+=2){
                answer[a++]+=i;
            }
            return answer;
        }
        else{
            int[] answer = new int[n/2+1];
            int a=0;
            for(int i=1;i<=n;i+=2){
            answer[a++]+=i;
            }
            return answer;
        }
        
    }
}