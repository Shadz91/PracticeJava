package com.practice.in;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Split {

	public static void main(String[] args) {
		String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

		String[] parts = date.split("-"); // Important
		System.out.println("Current Date:" + "\n" + date + "\n");

		System.out.println("After Splitting:");
		for (String x : parts) {
			System.out.println(x);
		}
	}

}