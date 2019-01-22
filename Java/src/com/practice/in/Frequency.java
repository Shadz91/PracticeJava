package com.practice.in;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {

		String str = "shhhadab";
		int l = str.length();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (int i = 0; i < l; i++) {
			char ch = str.charAt(i);// s
			Integer val = hmap.get(ch);// null

			// If this is first occurrence of element
			if (val == null)
				hmap.put(ch, 1);

			// If elements already exists in hash map
			else
				hmap.put(ch, val = val + 1);
		}

		// Print result
		hmap.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}
