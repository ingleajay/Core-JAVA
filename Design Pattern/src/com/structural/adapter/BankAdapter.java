package com.structural.adapter;

public class BankAdapter implements CreditCard{

	AxisBank axisBank;
	
	public BankAdapter(AxisBank axisBank) {
		this.axisBank=axisBank;
	}
	
	@Override
	public void giveBankDetails() {
		axisBank.FindBankName();
	}

	@Override
	public void getCreditCard() {
		axisBank.CheckCreditCard();
	}

}
