package com.algods;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPatternMatching {
	public boolean wordPattern(String pattern, String s) {
		Map<Character, String> lookupMap = new HashMap<>();
		Map<String, Character> wordSet = new HashMap<>();
		String[] words = s.split(" ");
		if(words.length == pattern.length())
			for (int i = 0; i < pattern.length(); i++) {
				if (Objects.nonNull(lookupMap.get(pattern.charAt(i)))) {
					if (!lookupMap.get(pattern.charAt(i)).equals(words[i])) {
						return false;
					} else {
						continue;
					}
				} else {
					if(wordSet.keySet().contains(words[i]))
						return false;
					lookupMap.put(pattern.charAt(i), words[i]);
					wordSet.put(words[i], pattern.charAt(i));
				}
			}
		else
			return false;
		return true;
	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode result = new ListNode();
	        ListNode current = result;
	        int overflow = 0;
	        while((null!=l1.next) || (null!=l2.next)) {
	        	if(l1 != null && l2!=null) {
	        		if(null == current.next)
	        			current = new ListNode();
	        		current = current.next;
	                int temp = l1.val + l2.val;
	                overflow = temp%10;
	                if(temp/10 > 0) {
	                    current.next = new ListNode();
	                    current.next.val = temp/10;
	                }
	                l1 = l1.next;
	                l2 = l2.next;
	            } else {
	                if(l1==null && l2!=null) {
		        		if(current.next == null)
		        			current = new ListNode();
		        		current = current.next;
	                    int temp=l2.val+current.next.val;
	                    current.val=temp%10;
	                    if(temp/10 == 0) {
	                        current.next = new ListNode();
	                        current.next.val = temp/10;
	                    }
	                    l2 = l2.next;
	                } else if(l1!= null && l2==null) {
		        		if(current.next == null)
		        			current = new ListNode();
		        		current = current.next;
	                    int temp=l1.val+current.next.val;
	                    current.val=temp%10;
	                    if(temp/10 == 0) {
	                        current.next = new ListNode();
	                        current.next.val = temp/10;
	                    }
	                    l1 = l1.next;
	                }
	            }
	        }
			return result;
	    }
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(lookup.keySet().contains(target-nums[i]))
                return new int[]{i, lookup.get(target-nums[i])};
            else
                lookup.put(nums[i], i);
        }
        return new int[]{};
    }

	public static void main(String[] args) {
		System.out.println(new WordPatternMatching().addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3, null))), new ListNode(2, new ListNode(4, new ListNode(3, null)))));
		//System.out.println(Arrays.toString(new WordPatternMatching().twoSum(new int[] {10, 30, 2, 4, 3, 1, 32, 46}, 4)));
		//System.out.println(new WordPatternMatching().wordPattern("abba", "dog dog dog dog"));
	}
}