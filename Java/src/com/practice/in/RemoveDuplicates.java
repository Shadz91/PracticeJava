package com.practice.in;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int n;
		int a[] = { 40, 10, 20, 30, 20, 20, 30, 20, 10, 20, 50, 50 };
		n = a.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j])
					a[j] = 0;
			}
		}

		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				System.out.println(a[i]);
			}
		}

	}

}
