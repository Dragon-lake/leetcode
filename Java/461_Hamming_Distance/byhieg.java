public class Solution {
    public int hammingDistance(int x, int y) {
        String str1 = Integer.toBinaryString(x);
        String str2 = Integer.toBinaryString(y);
        int n = str1.length() > str2.length() ? str1.length() : str2.length();
        if (n == str1.length()) {
            int diff = str1.length() - str2.length();
            String s = "";
            for (int i = 0 ; i < diff;i++) {
                s += "0";
            }
            str2 = s + str2;
        }else{
            int diff = str2.length() - str1.length();
            String s = "";
            for (int i = 0;i < diff;i++) {
                s += "0";
            }
            str1 = s + str1;
        }
        
        int count = 0;
        for (int i = 0 ; i < n;i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}