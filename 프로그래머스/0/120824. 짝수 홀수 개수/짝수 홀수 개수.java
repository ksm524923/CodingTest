class Solution {
    public int[] solution(int[] num_list) {
        int[] arr={num_list.length};
        int sum=0;
        int sum2=0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                sum+=1;
            }
            else sum2+=1;
        }
       int[] a=new int[2];
        a[0]=sum;
        a[1]=sum2;
        return a;
    }
}