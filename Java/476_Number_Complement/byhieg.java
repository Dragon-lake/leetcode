public class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        char[] chars = str.toCharArray();
        String result = "";
        for(int i = 0 ; i < chars.length;i++){
            result = result + (Integer.valueOf(chars[i] + "") == 1? 0:1);
        }
        return Integer.valueOf(result,2);
    }
}