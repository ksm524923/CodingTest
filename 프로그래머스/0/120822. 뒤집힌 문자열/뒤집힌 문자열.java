import java.util.*;
class Solution {
    public String solution(String my_string) {
        // String []answer =new String [my_string.length()];
        String answer="";
            for(int j=my_string.length()-1;j>=0;j--){
                answer+=my_string.charAt(j);
            }
        // [][][][][]              [j][a][r][o][n]
        // 0 1 2 3 4                0  1  2  3  4
        return answer;
    }
}