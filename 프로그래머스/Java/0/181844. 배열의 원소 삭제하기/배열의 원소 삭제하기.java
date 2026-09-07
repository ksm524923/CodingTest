class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int a=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    sum++;
                }
            }
            if(sum==0){
                a++;
            }
        }
        
        int[] answer = new int[a];
        int d=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    sum++;
                }
            }
            if(sum==0){
                answer[d++]=arr[i];
            }
        }
        return answer;
    }
}