package com.algods;

public class BalancingArray {

	public static void main(String[] args) {
		int[] arr = { 5, 5, 2, 5, 8 };
		System.out.println(countBalancingElements(arr));
	}

	static int countBalancingElements(int[] arr) {
		// Just calculate sumOfEven and sumOfOdd by iterating over all elements
		int odd = 0, even = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				even += arr[i];
			else
				odd += arr[i];
		}
		int ans = 0;
		int prevOdd = 0, prevEven = 0;
		for (int i = 0; i < arr.length; i++) {
			int nextEven = even - prevEven;
			int nextOdd = odd - prevOdd;
			if (i % 2 == 0) // Subtract values based on odd/even index values. This will return the
							// nextEven/nextOdd values from the remaining array
				nextEven -= arr[i];
			else
				nextOdd -= arr[i];
			// [0,1,2,3,4]
			if (prevOdd + nextEven == prevEven + nextOdd) // If remaining values are same from odd&even, increment the
															// ans.
				ans++;
			if (i % 2 == 0) // Keep adding Values to previousOdd & Even array
				prevEven += arr[i];
			else
				prevOdd += arr[i];
		}
		
		
//		for (int i = 0; i < arr.length; i++) {
//			int nextEven = 0, nextOdd = 0;
//			if (i % 2 == 0) {
//				nextEven = even - prevEven - arr[i];
//				nextOdd = odd - prevOdd;
//			} else {
//				nextEven = even - prevEven;
//				nextOdd = odd - prevOdd - arr[i];
//			}
//
//			if (prevEven + nextOdd == prevOdd + nextEven) 
//				ans++;
//			if (i % 2 == 0)
//				prevEven += arr[i];
//			else
//				prevOdd += arr[i];
//		}
		return ans;
	}

	static int countBalancingElements_AnotherSolution(int[] arr) {
		int ways = 0;

		for (int i = 0; i < arr.length; i++) {
			if (validate(i, arr))
				ways++;
		}
		return ways;
	}

	static boolean validate(int index, int[] arr) {
		int odd = 0;
		int even = 0;

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == index) // Ignore current running index
				continue;
			if (counter % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
			counter++;
		}
		return (odd == even);
	}

}
