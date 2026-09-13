class Solution {
    public int solution(int n, int k) {
        int sum=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            sum+=12000;
            if(i%10==0){
                sum2-=2000;
            }
        }
        for(int j=1;j<=k;j++){
            sum2+=2000;
        
        }
        return sum+sum2;
    }
}