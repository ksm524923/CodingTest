class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] B = binomial.split(" ");
        int num1 = Integer.parseInt(B[0]);
        int num2 = Integer.parseInt(B[2]);
        switch(B[1]){
            case "+":
                answer = num1 + num2; break;
            case "-":
                answer = num1 - num2; break;
            case "*":
                answer = num1 * num2; break;
        }
        return answer;
    }
}