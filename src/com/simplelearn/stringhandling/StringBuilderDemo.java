package com.simplelearn.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// mutable string
		// not thread safe and fast
		StringBuilder message = new StringBuilder("today is good day");
		System.out.println(message);
		// append new string textl
		message.append("Happy learing !	");
		System.out.println(message);
		// replace text
		message.replace(0, 2, "hello");
		System.out.println(message);

		// insert text
		message.insert(0, "H");
		System.out.println(message);
	}

}
