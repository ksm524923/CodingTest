class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for(int i=0;i<answer.length;i++){
            if(answer.length%2!=0){
                if(i%2==0){
                    arr[i]+=n;
                }
                answer[i]=arr[i];
            } else{
                if(i%2!=0){
                    arr[i]+=n;
                }
                answer[i]=arr[i];
            }
        }
        return answer;
    }
}