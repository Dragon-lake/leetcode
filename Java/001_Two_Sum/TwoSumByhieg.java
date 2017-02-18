package com.byhieg.algorithm;

import com.byhieg.utils.bprint.FullPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by byhieg on 17/2/19.
 * Mail to byhieg@gmail.com
 */
public class TwoSumByhieg {

    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                }
            }
        }
        return results;
    }

}
