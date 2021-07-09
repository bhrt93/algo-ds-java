package com.algods;

public class StringDivisor {
	private static int findSmallestDivisor(String s, String t) {
		if (s.length() % t.length() > 0)
			return -1;
		StringBuilder sb = new StringBuilder();
		int divisor = s.length() / t.length();
		for (int i = 0; i < divisor; i++)
			sb.append(t);
		if (!sb.toString().equals(s))
			return -1;
		for (int i = 1; i <= t.length(); i++) {
			sb = new StringBuilder();
			String subStr = t.substring(0, i);
			while (sb.length() < t.length()) {
				sb.append(subStr);
			}
			if (sb.toString().equals(t))
				return i;
		}
		return -1;
	}
	public static void main(String args[]) {

		String original = "bcdbcdbcdbcd";
		String original_two = "bcdbcdbcd";
		String to_be_divided_with_str = "bcdbcd";
		System.out.println(findSmallestDivisor(original, to_be_divided_with_str));
		System.out.println(findSmallestDivisor(original_two, to_be_divided_with_str));

	}

}
