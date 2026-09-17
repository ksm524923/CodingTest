class Solution {
    public int[] solution(int n, int k) {
        int sum=0;
        int[] answer = new int[n/k];
        for(int i=1;i<=n;i++){
            if(i%k==0){
                answer[sum]=i;
                sum+=1;
            }
        }
        return answer;
    }
}