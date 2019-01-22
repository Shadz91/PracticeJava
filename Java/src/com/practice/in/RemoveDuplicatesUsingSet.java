package com.practice.in;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {

		int arr[] = { 90, 10, 10, 20, 20, 90, 30, 30, 40, 40, 50, 50 };

		// Array to List
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		// List to Set
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
	}
}

/*
 * There is no shortcut for converting from int[] to List<Integer> as
 * Arrays.asList does not deal with boxing and will just create a List<int[]>
 * which is not what you want. You have to make a utility method.
 */
