class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        for (int idx : indices) {
            arr[idx] = "";
        }
        return String.join("", arr);
    }
}