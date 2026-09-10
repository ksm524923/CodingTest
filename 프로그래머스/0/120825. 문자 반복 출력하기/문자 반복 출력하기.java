class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int sum=0;
        for(int i=0;i<my_string.length();i++,sum++){
            for(int j=0;j<n;j++){
                answer+=my_string.charAt(sum);
            }
        }
        return answer;
    }
}