class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int sum=0;
        for(int i=0;i<array.length;i++){
            answer=array[i];
            if(answer==n){
                sum+=1;
            }
        }
        return sum;
    }
}