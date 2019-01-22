package com.practice.in;

public class SortArrayZeroesAndOnes {

	public static void main(String[] args) {

		int countZeroes = 0;
		int countOnes = 0;
		int a[] = { 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1)
				countOnes++;
			else
				countZeroes++;
		}

		for (int i = 0; i < countZeroes; i++) {
			System.out.print(0 + " ");
		}

		for (int i = 0; i < countOnes; i++) {
			System.out.print(1 + " ");
		}

	}

}
