package com.programs;

public class Palindrome {

	public static void main(String[] args) {
	
		int n = 454;
		 int r,sum=0;
		 int temp = n;
		 while(n>0){    
			   r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
		}  
		if(temp==sum)    
			   System.out.println("palindrome number " + temp);    
	    else    
			   System.out.println("not palindrome" + temp);  

	}
}

// n = 454 -> r =  n % 10 => 454 % 10  = ( r = 4 , n = 45) => sum = 4;
// n = 45 -> r = n % 10 => 45 % 10  = ( r = 5 , n = 4) => sum = 40 + 5 = 45 
// n = 4 -> r = n % 10 => 4 % 10  = ( r = 4 , n = 0) => sum = 450 + 4 = 454
 

