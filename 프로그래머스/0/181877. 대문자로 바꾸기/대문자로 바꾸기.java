class Solution {
    public String solution(String myString) {
        String upperString = "";
        for (int i = 0; i < myString.length(); i++){
            if(122 >= myString.charAt(i) && myString.charAt(i)>=97){
                upperString+=(char)(myString.charAt(i)-32);
            }
            else{
                upperString+=myString.charAt(i);
            }
        }
        return upperString;
        }
    }