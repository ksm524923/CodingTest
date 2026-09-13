class Solution {
    public String solution(int[] numLog) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int a = numLog[i] - numLog[i - 1];
            
            switch (a) {
                case 1:
                    str.append("w");
                    break;
                case -1:
                    str.append("s");
                    break;
                case 10:
                    str.append("d");
                    break;
                case -10:
                    str.append("a");
                    break;
            }
        }
        
        return str.toString();
    }
}