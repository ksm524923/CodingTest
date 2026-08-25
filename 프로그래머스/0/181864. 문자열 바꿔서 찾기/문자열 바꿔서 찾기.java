class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String conver=myString.replace("A", "C").replace("B", "A").replace("C", "B");
        if(conver.contains(pat)){
            answer=1;
        } else{
            return 0;
        }
        
        return answer;
    }
}