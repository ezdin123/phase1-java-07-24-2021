package com.simplilearn.arrays;

import java.util.Arrays;

public class StringArrayExample {

	public static void main(String[] args) {
		String names[] = { "Jones", "kemal", "Mustfa", "Andew" };
		System.out.println(Arrays.toString(names));
		System.out.println("Name ate index 0 : " + names[0]);
		// System.out.println("Name ate index 5 : "+names[5]);
		// //ArrayIndexOutOfBoundsException
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
