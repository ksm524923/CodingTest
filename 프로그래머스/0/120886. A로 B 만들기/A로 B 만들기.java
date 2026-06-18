import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String a="";
        int cnt=0;
        int sum=0;
        for(int i=0;i<after.length();i++){
                    cnt+=(int)after.charAt(i);
                    sum+=(int)before.charAt(i);
            }
            if(cnt!=sum)
                return 0;
            else return 1;
           
    }
}