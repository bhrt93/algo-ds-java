package com.leet.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
                public int[] twoSum(int[] nums, int target) {
                        Map<Integer, Integer> lookup = new HashMap<>();
                        for(int i=0;i<nums.length;i++) {
                                if(lookup.containsKey(target-nums[i]))
                                        return new int[]{i, lookup.get(target-nums[i])};
                                else
                                        lookup.put(nums[i], i);
                        }
                        return new int[]{};
                }

        public static void main(String[] args) {
                Problem1 problem1 = new Problem1();
                problem1.twoSum(new int[]{2,3}, 2);
        }
}
