package com.simplelearn.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		// mutable string and thread safe/synchronize and not fast
		StringBuffer message = new StringBuffer("today is good day");
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
