class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int a=0;
        int[] answer = {numlist.length};
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer=numlist;
            a++;
            }
            }
        
        int k=0;
        int[] arr=new int[a];
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                arr[k]=numlist[i];
                k++;
            }
        }
        return arr;
    }
}