class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int a=my_string.length()-n;
        for(int i=0;i<my_string.length()-a;i++){
            answer+=my_string.charAt(i);
        }
        return answer;
    }
}