package com.simplelearn.typeCasting;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// WAP converting for int , byte, short => float, double, long
		// Implicit Typecast : Automatically type cast
		/**
		 * Widening Typecast : Converts data from lower range value to higher range
		 * type. byte -> short -> int -> long -> float -> double.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println(" implict type casting  or widning type casting **********");
		// int intNumber =scanner.nextInt();
		byte byteNumber = scanner.nextByte();
		System.out.println("Enter Number " + byteNumber);
 
		short smallCount = byteNumber;
		int Inumber = byteNumber;
		float Fnumber = byteNumber;
		double dNumber = byteNumber;
		long lnumber = byteNumber;

		System.out.println("type casting byte  :" + byteNumber);
		System.out.println("type casting byte =>  short:" + smallCount);
		System.out.println("type casting  byte => long:" + lnumber);
		System.out.println("type casting  byte => float  :" + Fnumber);
		System.out.println("type casting   byte => double:" + dNumber);
		System.out.println("type casting  byte =>int:" + lnumber);

	}

}
