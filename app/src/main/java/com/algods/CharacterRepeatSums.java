package com.algods;

public class CharacterRepeatSums {
	
	public static void main(String[] args) {
		System.out.println(characterRepeats("aaabbbbccccddddeeeeee"));
	}

	private static String characterRepeats(String str) {
		if(str.isEmpty())
			return "";
		StringBuilder result = new StringBuilder("");
		char lastChar = str.charAt(0);
		int lastCount = 0;
		for(char c : str.toCharArray()) {
			if(c == lastChar) {
				lastCount++;
			} else {
				result.append(lastChar).append(lastCount);
				lastChar = c;
				lastCount = 1;
			}
		}
		if(lastCount != 0) {
			result.append(lastChar).append(lastCount);
		}
		return result.toString();
	}

}
