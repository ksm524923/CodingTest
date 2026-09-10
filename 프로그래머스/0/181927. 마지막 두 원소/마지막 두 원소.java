class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int a=0;
        int b=0;
        
        int sum=num_list[num_list.length-1];
        int sum2=num_list[num_list.length-2];
        
        for(int i=0;i<answer.length-1;i++){
            answer[i]=num_list[i];
        }
        
        if(sum > sum2){
            a=sum-sum2;
            answer[answer.length-1]=a;
        } else{
            b=sum*2;
            answer[answer.length-1]=b;
        }
        
        
        return answer;
    }
}