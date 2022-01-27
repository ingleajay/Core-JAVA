package com.methods;

public class Recursion {

	public static void main(String[] args) {
		
		// A method in java that calls itself is called recursive method.
		// Advantages  
		// 1. Recursion reduce the length of code.
		// 2. The code may be easier to write.
		
		// Disadvantages
		// 1.The computer may run out of memory if the recursive calls are not properly checked.
		// 2.Recursive functions are generally slower than non-recursive function.
		
		// factorial number
		System.out.println("Factorial of 5 is: "+fact(5));  

	}

	private static int fact(int n) {
		  if (n == 1)      
	            return 1;      
	      else      
	            return(n * fact(n-1));     
	}
}


// n*fact(n-1) -> n=5 - ( Bottom to top )
// f(5) = 5*f(4)
// f(4) = 5*4*f(3)
// f(3) = 5*4*3*f(2)
// f(2) = 5*4*3*2*f(1)
// f(1) = 5*4*3*2*1  = 120

