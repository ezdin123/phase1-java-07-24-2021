package com.simplilearn.accessmodifiers;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {
		// create object
		Father obj1 = new Father();
		System.out.println("amount :" + obj1.amount);
		System.out.println("park :" + obj1.park);
		// access methods
		System.out.println("amount" + obj1.showAmount());
		System.out.println("Park Name " + obj1.displayPark());
	}

}

class Father {
	// public variable
	public double amount = 233334.65d;
	public String park = "public park";

	// public method
	public double showAmount() {
		return amount;
	}

	public String displayPark() {
		return park;

	}

	// constructor, which has the exact same name as the class.
	public Father() {
	}

}
