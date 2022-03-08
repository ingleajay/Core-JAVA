package com.oops;

public class CopyConstructor {
	
	// Need : 
	// we face a problem where we required to create an exact copy of an existing object of the class. 
	// There is also a condition, 
	// if we have made any changes in the copy it should not reflect in the original one and vice-versa.
	
	private String NewFoodName;
	private String FoodName;
	
	CopyConstructor(String FoodName){							
		 this.FoodName = FoodName;
		System.out.println("This is food name from original constructor : " + FoodName);
		
	}
	
	CopyConstructor(CopyConstructor Food1){				
		   this.NewFoodName = Food1.FoodName.concat("Banana");
		   System.out.println("This is food name from copy constructor : " + NewFoodName); 
	}
	
	public String showName() {
		return NewFoodName;
	}

	public static void main(String[] args) {
		// In the copy, it should not reflect in the original one and vice-versa.
		
		CopyConstructor food1 = new CopyConstructor("Mango");
		CopyConstructor food2 = new CopyConstructor(food1);
		System.out.println("Using Method : " + food2.showName());
		
	}

}
