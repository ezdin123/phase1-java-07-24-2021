package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// arrays is an ordered collection of simlliar type of data elements.
		int numbers[] = { 45, 754, 874, 23, 30 };
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		// access element by index
		System.out.println("Element at index 0 : " + numbers[0]);
		System.out.println("Element at index 5 : " + numbers[4]);

		// access elements ith iterations
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("ELements at index : " + index + " value : " + numbers[index]);
		}

	}

}
