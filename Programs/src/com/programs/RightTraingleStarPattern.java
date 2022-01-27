package com.programs;

public class RightTraingleStarPattern {

	public static void main(String[] args) {
		
		//right traingle star pattern
			int n = 5;
			int i, j, k;
			for(i=1;i<=n;i++) {
				for(j=1;j<=i;j++) {
						System.out.print("*"); 
				}
				System.out.println();
			}
	}
}

// row -> i , col- j

// ( i=1 1<=5 , j=1 1<=1) -> *
// ( i=2 2<=5 , j=1 1<=2) -> * *
// ( i=3 3<=5 , j=1 1<=3) -> * * *
// ( i=4 4<=5 , j=1 1<=4) -> * * * * 
// ( i=5 5<=5 , j=1 1<=5) -> * * * * *