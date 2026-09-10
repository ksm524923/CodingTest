class Solution {
    public int solution(int num, int k) {
        String answer = num+"";
        int a=-1;
        for(int i=0;i<answer.length();i++){
           if(answer.charAt(i)==(char)(k+'0')){
               a=i+1;
               break;
           } 
        }
        return a;
    }
}