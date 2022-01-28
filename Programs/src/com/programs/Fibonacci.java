package com.programs;

public class Fibonacci {
	
	// series -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int n = 10;
		String series = "series : " + a + " " + b;

		for(int i=2;i<n;i++) {
			int c = a+b;
			series = series + " " + c;
			a = b ;
			b = c;
		}
		System.out.println(series);
	}
}

// c = 0 , a = 0, b = 1
// c = 1 , a = 1, b = 1
// c = 2 , a = 1, b = 2
// c = 3 , a = 2, b = 3
// c = 5 , a = 3, b=5.....
