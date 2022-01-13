package com.structural.adapter;

public class SbiBank implements CreditCard{

	@Override
	public void giveBankDetails() {
		System.out.println("This is SBI Bank");
	}

	@Override
	public void getCreditCard() {
		System.out.println("SBI provide Credit card to you");
	}

}
