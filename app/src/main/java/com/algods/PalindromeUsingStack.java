package com.algods;

import java.util.Stack;

public class PalindromeUsingStack {
    public static void main(String[] args) {
        System.out.println(isPalindromeAlternative1("racecar"));
        System.out.println(isPalindromeAlternative1("hello"));
        System.out.println(isPalindromeAlternative1("mew"));
        System.out.println(isPalindromeAlternative1("I did, did I ?"));
        System.out.println(isPalindromeAlternative1("woow"));

    }

    private static boolean isPalindromeAlternative1(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.length();i++) {
            if (Character.isAlphabetic(input.charAt(i)))
                stack.push(input.charAt(i));
        }
        for(int i=0;i<input.length();i++) {
            if (Character.isAlphabetic(input.charAt(i)))
                if(stack.pop() != input.charAt(i))
                    return false;
        }
        return true;
    }

    private static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.length();i++) {
            if (i < (input.length() / 2)) {
                if (Character.isAlphabetic(input.charAt(i)))
                    stack.push(input.charAt(i));
            } else if (i == input.length() / 2 && input.length() % 2 != 0) {
                continue;
            } else if(stack.pop() != input.charAt(i))
                return false;
        }
        return true;
    }


}
