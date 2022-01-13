package com.oops;

public class CopyConstructor {
	
	private String NewFoodName;
	private String FoodName;
	
	CopyConstructor(String FoodName){							
		 this.FoodName = FoodName;
		System.out.println("This is food name from original constructor : " + FoodName);
		
	}
	
	CopyConstructor(CopyConstructor Food1){				
		   this.NewFoodName = Food1.FoodName;
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
