package com.practice.in;

public class Finally {
	public static void main(String[] args) {

		try {
			int a = 10 / 0;
			System.out.println("Div");
		} catch (ArithmeticException e) {
			System.out.println("Task 1 is completed");
		} finally {
			System.out.println("finally block executed");
		}

		System.out.println("Rest of the code...");

	}
}
