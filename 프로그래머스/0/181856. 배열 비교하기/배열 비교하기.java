//arr1=1  arr2=-1

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            answer+=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            sum+=arr2[i];
        }
        
        if(arr1.length<arr2.length){
            return -1;
        }
        else if(arr1.length>arr2.length){
            return 1;
        }
        
        else {
            if(sum<answer){
                return 1;
            } else if(sum>answer){
                return -1;
            } else{
                return 0;
            }
        }
    }
}