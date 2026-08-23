class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int answer2=0;
        for(int i=0;i<num_list.length;i++){
            answer*=num_list[i];
        }
        
        for(int i=0;i<num_list.length;i++){
            answer2+=num_list[i];
        }
       
        if(answer<answer2*answer2){
            return 1;
        } else{
            return 0;
        }
        
    }
}