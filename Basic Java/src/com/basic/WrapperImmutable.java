package com.basic;

public class WrapperImmutable {

	Integer i  = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperImmutable w = new WrapperImmutable();
		System.out.println("Intial Value : " + w.i);
		
		modify(w.i);
		System.out.println("After value : " + w.i);
	}
	private static void modify(Integer i) {
		i = i+1;
	}
}
