package com.algods;

import java.util.ArrayList;
import java.util.List;

public class Armstrong {
	
	public static boolean isArmstrong(int num) {
		int digitCount = 0;
		List<Integer> digits = new ArrayList<>();
		int orignalNumber = num;
		while(num !=0 ) {  
			num = num/10;
			digits.add(num);
			digitCount++;
			
		}
		int sum =0;
		num = orignalNumber;
		while(num !=0) {
			int digit = num % 10;
			num = num / 10;
			sum = sum + (int) Math.pow(digit, digitCount);
			System.out.println(sum+"--"+digit);
		}
		return sum==orignalNumber;
	}
	public static void main(String[] args) {
		System.out.println(isArmstrong(1531));
	}
}
