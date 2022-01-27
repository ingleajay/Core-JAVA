package com.methods;

public class ReturnStatement {

	public static void main(String[] args) {
		
		//return is a reserved keyword & we can’t use it as an identifier. 
		// return is used with method
		// you can't write any statement after return keyword
		
		// return greatest number from a,b,c
		
		int a = 110;
		int b = 52;
		int c = 34;
		
		int no = greatestNumber(a,b,c);
		System.out.println("Greatest number  : " + no);

	}

	private static int greatestNumber(int a, int b, int c) {
		
		if((a>b) && (a>c))
			return a;
		else if((b>a) && (b > c)) 
			return b;
		else
			return c;
	}
}
