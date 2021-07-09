package com.algods;

import java.util.Arrays;

public class FirstMissingPositive {
	public int firstMissingPositive2(int[] nums) {
		int n = nums.length;
		boolean oneExist = false;
		for (int o : nums) {
			if (o == 1)
				oneExist = true;
		}
		if (!oneExist)
			return 1;

		// making sure we will never see a number in the
		// array apart from 1...n
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0 || nums[i] > n)
				nums[i] = 1;
		}

		for (int i = 0; i < nums.length; i++) {
			int v = Math.abs(nums[i]);

			// simply invalidating an index v and it's content
			// because we found a value v
			if (v == n) {
				nums[0] = -1 * Math.abs(nums[0]);
			} else {
				nums[v] = -1 * Math.abs(nums[v]);
			}
		}

		for (int i = 1; i < n; i++) {
			if (nums[i] > 0)
				return i;
		}

		if (nums[0] > 0)
			return n;
		return n + 1;
	}

	public static int firstMissingPositiveBestAnswerFromLeetcode(int[] nums) {
		int result = 50000;
		int size = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < size; i++) {
			if (nums[i] > 0) {
				if (result > nums[i]) {
					result = nums[i];
				}
			}
		}
		if (1 < result) {
			return 1;
		}
		for (int i = 0; i < size; i++) {
			if (nums[i] == result) {
				result++;
			}
		}
		return result;
	}

	public static int firstMissingPositive(int[] nums) {
		if (nums.length < 1)
			return 1;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > nums.length || nums[i] < 1)
				nums[i] = nums.length + 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= nums.length) {
				int value = (int) Math.abs(nums[i]);
				if (value > nums.length)
					continue;
				nums[value - 1] = nums[value - 1] < 0 ? nums[value - 1] : nums[value - 1] * -1;
			}
		}
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > 0)
				return i + 1;
		return nums.length + 1;
	}

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[] {}));
		System.out.println(firstMissingPositive(new int[] { 3, 4, -1, 1 }));
		System.out.println(firstMissingPositiveBestAnswerFromLeetcode(new int[] { 3, 4, -1, 1 }));

	}

}
