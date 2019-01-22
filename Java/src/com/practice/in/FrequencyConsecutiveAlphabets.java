package com.practice.in;

public class FrequencyConsecutiveAlphabets {

	public static void main(String[] args) {
		String str = "aaabbddaabbcc";
		int n = str.length();

		for (int i = 0; i < n - 1; i++) 
		{
			int count = 0;
			for (int j = i; j < n; j++) 
			{
				if (str.charAt(i) == str.charAt(j))
					count++;
				else {
					i += count - 1;
					break;
				}
			}
			System.out.print(Integer.toString(count) + Character.toString(str.charAt(i)) + ", ");
		}
	}

}
