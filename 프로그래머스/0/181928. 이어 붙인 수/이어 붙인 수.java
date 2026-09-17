class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String munza="";
        String somunza="";
        int a=0;
        int b=0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==1){
                a=(a*10)+num_list[i];
                // somunza+=Integer.toString(num_list[i]);
            } else{
                b=(b*10)+num_list[i];
                // somunza+=Integer.toString(num_list[i]);
            }
        }
        // int num1=Integer.parseInt(munza);
        // int num2=Integer.parseInt(somunza);
        // return num1+num2;
        return a+b;
    }
}