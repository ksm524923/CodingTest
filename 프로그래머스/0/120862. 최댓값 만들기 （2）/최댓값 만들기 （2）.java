class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        int answer1=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                    answer1=numbers[i]*numbers[j];
                if(answer<answer1){
                     answer=numbers[i]*numbers[j];
                }
                
            }
        }
        return answer;
    }
}