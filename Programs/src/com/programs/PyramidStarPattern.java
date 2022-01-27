package com.programs;

public class PyramidStarPattern {

	public static void main(String[] args) {
		
		int n = 5;
		int i, j, k;
		for(i=1;i<=n;i++) {
			for(k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}

// row -> i , col -> j ; space -> k

//( i=1 1<=5, k=1 1<=4, j=1 1<=1) ->        * 
//( i=2 2<=5, k=1 1<=3, j=1 1<=2) ->      *   * 
//( i=3 3<=5, k=1 1<=2, j=1 1<=3) ->     *  *  *
//( i=4 4<=5, k=1 1<=1, j=1 1<=4) ->   *  *   *  *
//( i=5 5<=5, k=1 1<=0, j=1 1<=5) -> *  *   *   *   * 