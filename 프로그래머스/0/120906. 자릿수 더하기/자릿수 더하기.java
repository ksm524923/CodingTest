class Solution {
    public int solution(int n) {
        int sum=0;
        String answer =n+"";
        for(int i=0;i<answer.length();i++){
            sum+=answer.charAt(i)-'0';
        }
        return sum;
    }
}