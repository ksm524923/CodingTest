class Solution {
    public int solution(int order) {
        int answer=0;
        int sum=0;
        while (order > 0){
            int now=order%10;
            if( now==3 || now==6 || now==9){
                sum+=1;
            }
            order=order/10;
        }
        return sum;
    }
}