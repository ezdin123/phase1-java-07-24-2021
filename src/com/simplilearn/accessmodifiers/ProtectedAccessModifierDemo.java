package com.simplilearn.accessmodifiers;

public class ProtectedAccessModifierDemo {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.showPower();
		// access protected property
		hero.usePower();
	}

}
