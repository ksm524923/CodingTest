class Solution {
    public int[] solution(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum++;
            }
        }
        
        int[] answer = new int[sum];
        int a=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer[a]=i;
                a++;
            } 
        }
        
        
        return answer;
    }
}