package com.byhieg.algorithm;

import com.byhieg.Main;

/**
 * Created by byhieg on 17/2/19.
 * Mail to byhieg@gmail.com
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int length = 0;
        int t = x;
        while (t != 0) {
            t = t / 10;
            length++;
        }

        int count = length;
        for (int i = 0; i < length / 2; i++) {
            int right = x % 10;
            System.out.println("right = "  + right);
            int left = x / (int) Math.pow(10, count - 1);
            System.out.println("left = " + left);
            if (left != right) {
                return false;
            }
            x = x - right - right * ((int) Math.pow(10, count - 1));
            x = x / 10;
            count -= 2;
            System.out.println("x = " + x);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(2135312));
    }
}
