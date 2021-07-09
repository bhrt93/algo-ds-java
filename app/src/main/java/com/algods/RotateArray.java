package com.algods;

public class RotateArray {
	/* Function to left rotate arr[] of size n by d */
	void leftRotate(int arr[], int d, int n) {
		/* To handle if d >= n */
		d = d % n;
		int i, j, k, temp;
		int g_c_d = gcd(d, n);
		System.out.println("gcd="+g_c_d);
		for (i = 0; i < g_c_d; i++) {
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	/* UTILITY FUNCTIONS */

	/* function to print an array */
	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	/* Fuction to get gcd of a and b */
	int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
//		System.out.println(rotate.gcd(12, 2));
		System.out.println(rotate.gcd(2, 12));
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		rotate.printArray(arr, 12);
		System.out.println();
		rotate.leftRotate(arr, 2, 12);
		rotate.printArray(arr, 12);
	}
}
