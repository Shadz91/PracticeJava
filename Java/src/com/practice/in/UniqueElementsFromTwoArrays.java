package com.practice.in;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementsFromTwoArrays {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(2, 3, 4, 5);

		Set<Integer> union = new HashSet<>(list1);
		Set<Integer> intersection = new HashSet<>(list1);

		union.addAll(list2);// Union
		System.out.println("Union: " + union);

		intersection.retainAll(list2); // Intersection
		System.out.println("Intersection: " + intersection);

		union.removeAll(intersection);
		System.out.println("Difference: " + union);

	}
}