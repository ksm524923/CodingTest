class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch=' ';
        for(int i=0;i<my_string.length();i++){
            ch=my_string.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
                answer+=ch;
            } else{
                ch=(char)(ch-32);
                answer+=ch;
            }
        }
        return answer;
    }
}