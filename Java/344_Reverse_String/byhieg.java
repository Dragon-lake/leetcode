public class Solution {
    public String reverseString(String s) {
        char [] result = s.toCharArray();
        int i = 0 ; 
        int j = s.length() - 1;
        while(i < j){
            char tmp = result[i];
            result[i] = result[j];
            result[j] = tmp;
            i++;
            j--;
        }
        return new String(result);
    }
}