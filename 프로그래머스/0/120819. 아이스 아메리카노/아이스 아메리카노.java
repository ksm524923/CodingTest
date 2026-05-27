class Solution {
    public int[] solution(int money) {
    int[] a=new int[2];
        a[0]=money/5500;
        a[1]=money%5500;
        
        return a;
    }
}