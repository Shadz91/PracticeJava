package com.practice.in;

public class BubbleSort {

	public static void main(String[] args) {

		int n, temp;
		int a[] = { 50, 41, 311, 521, 1 };

		n = a.length;
		for (int i = 0; i < n - 1; i++) 
		{
			for (int j = 0; j < n - i - 1; j++) 
			{
				if (a[j] > a[j + 1]) 
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
// Bubble Sort takes O(n2) time