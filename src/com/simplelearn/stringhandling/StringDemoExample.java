package com.simplelearn.stringhandling;

public class StringDemoExample {

	public static void main(String[] args) {
			//string literal
		String str1 = "Jone";
		String str2 = "Jone";
		
		if(str1 == str2) {
			System.out.println("Same string");
		}else {
			System.out.println("different  string");
		}
		//each  time you create a string literal, the JMV checks the "string constant pool first"
		//If the string already exists in pool, a reference to the pooled instance is required.
		System.out.println("************************");
		//string by new keyword 
		//each time new keyword is going to be generate new string reference.
		String username1 = new String ("JoneSmith");
		String username2 = new String ("JoneSmith");
		if (username1 == username2) {
			System.out.println("same string");
		}else {
			System.out.println("different string");
		}
	}

}
