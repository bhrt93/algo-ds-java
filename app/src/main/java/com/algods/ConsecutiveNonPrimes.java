package com.algods;

public class ConsecutiveNonPrimes {
	// function to find factorial of given
	// number
	static long factorial(int n) {
		long res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	// Prints n consecutive numbers.
	static void printNComposite(int n) {
		System.out.printf("n=%2d",n);
		long fact = factorial(n + 1);
		System.out.printf(" f(%d)=%9d", n+1, fact);
//		System.out.print(" f(%d)=",n+1+fact+" ");
		for (int i = 2; i <= n + 1; ++i) {
			System.out.print(" i="+i+" ");
			System.out.print(fact + i + " ");
		}
		System.out.println();
	}

	// Driver program to test above function
	public static void main(String[] args) {
		for(int n=0; n <=10; n++)
		printNComposite(n);

	}
}