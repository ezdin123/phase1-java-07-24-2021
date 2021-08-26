package com.simplelearn.typeCasting;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO: WAP converte long, float, int => byte, short, double
		Scanner sc = new Scanner(System.in);
		System.out.println(": :type casting Explict or narrowing type cast ::");
		long lnumber = sc.nextLong();
		System.out.println("Pease Enter number :");
		byte bNum = (byte) lnumber;
		short sNum = (short)lnumber;
		//implict type casting 
		double dNum = lnumber;
		System.out.println("type casting byte  :" + lnumber);
		System.out.println("type casting  long:" + bNum);
		System.out.println("type casting float  :" + sNum);
		System.out.println("type casting  double:" + dNum);
		 
		
		
		

	}

}
