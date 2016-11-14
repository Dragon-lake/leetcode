package com.byhieg.algorithm;

import com.byhieg.init.InitBlock;

/**
 * Created by byhieg on 17/2/19.
 * Mail to byhieg@gmail.com
 */
public class ReverseInteger {

    public int reverse(long x) {
        String str = String.valueOf(x);
        StringBuffer sb = new StringBuffer();
        int size = str.length();
        char[] chars = str.toCharArray();
        if (x > 0) {
            for (int i = 0; i < size; i++) {
                chars[i] = str.charAt(size - i - 1);
                sb.append(chars[i]);
            }
            Long l = Long.valueOf(sb.toString());
            System.out.println(l);
            int max = Integer.MAX_VALUE;
            if (l > (max)) {
                return 0;
            }
            return Integer.valueOf(sb.toString());

        } else if (x < 0){
            for (int i = 1 ; i < size ; i++) {
                chars[i] = str.charAt(size - i);
                sb.append(chars[i]);
            }
            Long l = 0 - Long.valueOf(sb.toString());
            if (l < Integer.MIN_VALUE) {
                return 0;
            }
            return 0 - Integer.valueOf(sb.toString());
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1001));
    }
}
