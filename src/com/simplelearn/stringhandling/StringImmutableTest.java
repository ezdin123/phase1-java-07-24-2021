package com.simplelearn.stringhandling;

public class StringImmutableTest {

	public static void main(String[] args) {
		//In java, string objects are immutable.
		// Immutable simply means unmodifiable or unchangeable values.
		String username = "Jone";
		//concat() => update string
		String response = username.concat("Andrew");
		System.out.println(username);//old name => old string 
		System.out.println(response); //new name => new string 
		
	}

}
