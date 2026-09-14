class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr=new char[my_string.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=my_string.charAt(i);
        }
        char a=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=a;
        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        return String.valueOf(answer);
    }
}