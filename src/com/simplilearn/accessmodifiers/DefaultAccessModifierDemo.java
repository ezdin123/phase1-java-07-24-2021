package com.simplilearn.accessmodifiers;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {

		Hero hero = new Hero();
		Brother brother = new Brother();
		System.out.println("the money  " + brother.money);
		System.out.println("the shoes  " + brother.shoes);
	}

}

class Brother {

	/// default properties
	double money = 345456;
	String shoes = "XYZ";

	// default methods
	void showAll() {
		System.out.println("Money : " + money + "  Shoes : " + shoes);
	}

	Brother() {
	}

}