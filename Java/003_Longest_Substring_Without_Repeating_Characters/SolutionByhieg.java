package com.byhieg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shiqifeng on 2017/2/21.
 * Mail byhieg@gmail.com
 */
public class SolutionByhieg {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 1;
        char[] chars = s.toCharArray();
        int size = s.length();
        if (size == 0) {
            return 0;
        }
        for (int i = 0; i < size; i++) {
            String result = chars[i] + "";
            for (int j = i + 1; j < size; j++) {
                if (result.contains(chars[j] + "")) {
                    break;
                }else{
                    result += chars[j];
                    if (maxLength < result.length()) {
                        maxLength = result.length();
                        if (maxLength == 95) {
                            return 95;
                        }
                    }
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new SolutionByhieg().lengthOfLongestSubstring("abbba"));
    }
}
