package com.arrays;

public class BasicsOfArray {

	public static void main(String[] args) {
		
		// Need : 
		// we need to store 100 student name, use basic approach -> String stud1 = "jay", String stud2 ="Ajay"....
		// -> worst programming
		
		// When to use:
		   // -> when we know size of elements or size of objects then we should go for array
		   // ex. student reg - 100 then use array 100 size only, otherwise rest memory will be waste 
		
		// array is an object which contains elements of a similar data type in contiguous memory location.
		// Array in Java is index-based.
		// We can store primitive values or objects in an array in Java.
		// Advantages : 
		   // 1. Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
		   // 2. Random access: We can get any data located at an index position.
		//Disadvantage : 
		  // 1. array is in fixed size
		  // 2. It only hold homogenous data -> same data type 
		
		
		// Array declaration 
		// types : one dimesional array
		int[] x; 
		int []y; 
		int z[];
		// Note : At time of declaration we can't give size of array => int[6] x; => wrong
		
		// two dimensional array
		// => all correct
		int[][] v; 
		int [][]l; 
		int q1[][]; 
		int[] []q2; 
		int[] q3[]; 
		int []q4[]; 
		
		// check array declaration: 
		int[] p,q;  // => true => p = 1 dim , q = 1 dim
		int[] c[],d;  // => true => c = 2 dim, d = 1 dim
		int[] e[],f[]; //=> true => e=2 dim, f=2 dim
		int[] []g,h; // => true => g=2 dim, h=2 dim
		int[] []m, n[]; // => true => m=2 dim, n=3 dim
		//int[] []k, []l; //=> false => complie time error => [] is allowd for only first and for other is error
		
		int[] []mm,nn[],ww[]; // => mm = 2 dim , nn = 3 dim , ww => 4 dim
		
		// Three dimesional 
		int[][][] p1;
		int [][][]p2;
		int p3[][][];
		int[] [][]p4;
		int[] p5[][];
		int[] []p6[];
		int[][] p7[];
		int[][] []p8;
		int [][]p9[];
		int []p0[][];
		
		// Array Creation => specify size
		int[] oo = new int[3]; 
		int[][] o1 = new int[2][3];
		double[] o2 = new double[4];
		short[] o3 = new short[5];
		float[] o4 = new float[6];
		byte[] o5 = new byte[7];
		boolean[] o6 = new boolean[2];
		System.out.println("Check which type of array created ? " + oo.getClass().getName() +
				" " + o1.getClass().getName() + " " + o2.getClass().getName() + " " + 
				o3.getClass().getName() + " " + o4.getClass().getName()+ " " + o5.getClass().getName() + 
				" " + o6.getClass().getName());
		
		// array can be size of zero
		int[] jj = new int[0];
		System.out.println("length of array :"+jj.length);
		
		// array can not have size negative
		int[] jp = new int[-2]; // negative array size exception
		
		// array can have charcter as size
		int[] jk = new int['a'];
		System.out.println("length of array :"+jk.length);

	}
}
