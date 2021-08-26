package com.simplelearn.typeCasting;

import java.util.Scanner;

public class Exmaple3 {

	public static void main(String[] args) {
		// TODO WAP for string to number value (byte , short , int, long double , float)
		/*// string(non-primitive type)  to int (primitive type)   => Wrapper class
		 * convert string to number 
		 * String st = "1234"; its possible 
		 * String s2 = "string123" its not possible
		 *  */
		Scanner sc = new Scanner(System.in);
		System.out.println("type casting String to number :");
		System.out.println("please Enter String");
		// Non convertible string :> NumberFormatException
		String st = sc.next();
		
		//String st = "1234";
		 int Itnumb = Integer.parseInt(st);
		 short  stnumb = Short.parseShort(st);
		 float  ftnumb = Float.parseFloat(st);
		 long   ltnumb = Long.parseLong(st);
		 double  dtnumb = Double.parseDouble(st);
		 //byte  btnumb = Byte.parseByte(st); //cant converte value is out of range 
		 
			System.out.println("type casting  int:" + Itnumb);
			System.out.println("type casting short  :" + stnumb);
			System.out.println("type casting  float:" + ftnumb);
			System.out.println("type casting long  :" + ltnumb);
			System.out.println("type casting  double:" + dtnumb);
			//System.out.println("type casting  byte:" + btnumb);
	 
		
		

	}

}
