package com.programs;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		System.out.println("Matrix Addition allowed only if it is square matrix");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row = sc.nextInt();
		System.out.println("Enter no of columns");
		int col = sc.nextInt();
		
		// Enter data for matrix1
		int[][] m1 = new int[row][col];
		System.out.println("Enter data for matrix 1");
		for(int i=0;i<row;i++) {
			for(int j=0; j<col; j++) {
				int data  = sc.nextInt();
				m1[i][j] = data;
			}
		}
		System.out.println("See matrix 1 : ");
		for(int[] ele : m1) {
			for(int e : ele) {
				System.out.print(e + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		// Enter data for matrix1
		int[][] m2 = new int[row][col];
		System.out.println("Enter data for matrix 2");
		for(int i=0;i<row;i++) {
					for(int j=0; j<col; j++) {
						int data  = sc.nextInt();
						m2[i][j] = data;
					}
	    }
		System.out.println("See matrix 2 : ");
		for(int[] ele : m2) {
					for(int e : ele) {
						System.out.print(e + " ");
					}
					System.out.println(" ");
		}
		System.out.println(" ");
		
		// Add matrix 1 and matrix 2
		int[][] r = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				int res = m1[i][j]+m2[i][j];
				r[i][j] = res;
			}
		}
		System.out.println("See result matrix  : ");
		for(int[] ele : r) {
					for(int e : ele) {
						System.out.print(e + " ");
					}
					System.out.println(" ");
		}
		System.out.println(" ");
	}
}
