package com.java8;

import java.util.function.Supplier;

public class SupplierPredefine {

	public static void main(String[] args) {
		
		// Example : to generate OTP
		
		Supplier<String> otp = () -> {
			String o = "";
			for(int i=0;i<6;i++) {
				o = o + (int)(Math.random()*10);
			}
			return o;
		};
		System.out.println(otp.get());
	}
}
