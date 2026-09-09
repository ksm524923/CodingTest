class Solution {
    public int solution(int a, int b) {
        String strAB = String.valueOf(a) + String.valueOf(b);
        String strBA = String.valueOf(b) + String.valueOf(a);
        int numAB = Integer.parseInt(strAB);
        int numBA = Integer.parseInt(strBA);
        if (numAB >= numBA) {
            return numAB;
        } else {
            return numBA;
        }
    }
}