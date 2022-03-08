package com.programs;

public class ConstructorWithArray {

	public ConstructorWithArray(int[] a) {
		
		int res = add(a);
		System.out.println("Addition  : " + res);
	}

	private int add(int[] a) {
		int sum =0;
		for(Integer ele : a) {
			sum = sum + ele;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		ConstructorWithArray c = new ConstructorWithArray(a);
	}
}
