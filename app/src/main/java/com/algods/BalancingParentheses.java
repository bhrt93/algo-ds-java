package com.algods;

public class BalancingParentheses {

	public static void main(String[] args) {
//		String str = "((((";
//		String str = "(()))";
//		String str = ")))(((";
		String str = ")))(";
//		String str = "";
//		String str = "((()";
//		String str = "((()))";
		System.out.println(getMinOperations(str));

	}
	
	// Assumption that only string will only contain ( & ) chars. If other characters are passed, we need to 
	//throw a runtime exception or eliminate using regex. These are not included as a part of below solution.

	private static int getMinOperations(String str) {
		int answer = 0, balance = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				balance++; // Increment the value to 1, indicates and opening bracket was encountered
			} else {
				balance--; // Decrement by 1, indicates and closing bracket was encountered
			}

			// ((((, means below condition will not execute and balance will have value of 4
			// from above if check.
			if (balance == -1) {
				answer++;
				balance++;
			}
		}
		return answer +  balance;
//		return Math.abs(balance);
	}
}

