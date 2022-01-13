package com.oops.packages2;

import com.oops.packages1.ProtectedAnimal;

public class ProtectedDog extends ProtectedAnimal{
	
	// protected access modifier

	public static void main(String[] args) {
		
		ProtectedDog a = new ProtectedDog();
		a.barking();
	}

	@Override
	protected void barking() {
		super.barking();
		System.out.println("Dog is barking..");
	}

}
