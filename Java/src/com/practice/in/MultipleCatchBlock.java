package com.practice.in;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Task 1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Task 2 is completed");
		} catch (Exception e) {
			System.out.println("Common Task is completed");
		}
		System.out.println("Rest of the code...");
	}
}

/*
 * Rule: All catch blocks must be ordered from most specific to most general
 * i.e. catch for ArithmeticException must come before catch for Exception.
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems:
 * Unreachable catch block for ArithmeticException. It is already handled by the
 * catch block for Exception Unreachable catch block for
 * ArrayIndexOutOfBoundsException. It is already handled by the catch block for
 * Exception
 * 
 * at com.mindtree.in.Exceptions.main(Exceptions.java:13)
 */