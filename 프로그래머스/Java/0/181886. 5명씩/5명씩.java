class Solution {
    public String[] solution(String[] names) {
        int sum=0;
        for(int i=0;i<names.length;i++){
            if(i%5==0){
                sum++;
            }
        }
        String[] answer = new String[sum];
        int a=0;
        for(int i=0;i<names.length;i++){
            if(i%5==0){
                answer[a]=names[i];
                a++;
            }
        }
        return answer;
    }
}