package com.programs;

public class Factorial {

	public static void main(String[] args) {
		
		  // n = 5 ,  
		  // 1 ! = 1
		  // 2 ! = 1 * 2  = 2
		  // 3 ! = 1 * 2 * 3  = 6
		  // 4 ! = 1 * 2 * 3 * 4 = 24
		  // 5! = 1 * 2 * 3 * 4* 5 =120
		
		  int i,fact=1;  
		  int number=5;    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  
		  System.out.println("Factorial of "+number+" is by for loop: "+fact);   
		  
		  int h = 1;
		  int f = 1;
		  while( h <= number ){  
	            f= f* h;   
	            h++;  
	      }  
		  
		  System.out.println("Factorial of "+number+" is by while loop: "+f);  
		  
		  
		  int m = 1;
		  int n = 1;
		  do {
			  n= n* m;   
	            m++;  
		  }
		  while( m <= number );  
		  
		  System.out.println("Factorial of "+number+" is by do -while loop: "+n);
		  
		  
	}
}

// i = 1 , fact = 1
// i = 2 , fact = 2
// i = 3 , fact = 6
// i = 4 , fact = 24
// i = 5 , fact = 120

