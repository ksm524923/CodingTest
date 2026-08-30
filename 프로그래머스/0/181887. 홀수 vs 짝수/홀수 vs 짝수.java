class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        for(int i=0;i<num_list.length;i+=2){
            answer+=num_list[i];
        }
        
        for(int i=1;i<num_list.length;i+=2){
            sum+=num_list[i];
        }

        return answer >= sum ? answer : sum;
    }
}