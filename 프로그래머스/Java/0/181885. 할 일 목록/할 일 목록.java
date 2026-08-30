class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int sum=0;
        for(int i=0;i<finished.length;i++){
            if(finished[i]==false){
                sum++;
            }
        }
        int a=0;
        String[] answer = new String[sum];
        for(int i=0;i<todo_list.length;i++){
            if(finished[i]==false){
                answer[a]=todo_list[i];
                a++;
            }
        }
        return answer;
    }
}