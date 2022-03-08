package com.oops.packages2;

import com.oops.packages1.ProtectedAnimal;

public class ProtectedDog extends ProtectedAnimal{
	
	// protected access modifier

	public static void main(String[] args) {
		
		// 4. Protected Modifier : The access level of a protected modifier is within the package and 
		// outside the package through child class. 
		// If you do not make the child class, it cannot be accessed from outside the package.
		
		ProtectedDog a = new ProtectedDog();
		a.barking();
	}

	@Override
	protected void barking() {
		super.barking();
		System.out.println("Dog is barking..");
	}

}
