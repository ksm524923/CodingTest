class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for(int i=0;i<sides.length-1;i++){
            for(int j=0;j<sides.length-1-i;j++){
                if(sides[j]>sides[j+1]){
                    int temp=sides[j];
                    sides[j]=sides[j+1];
                    sides[j+1]=temp;
                }
            }
        }
        if(sides[2]>=sides[0]+sides[1]){
            return 2;
        } else{
            answer=1;
        }
        return answer;
    }
}