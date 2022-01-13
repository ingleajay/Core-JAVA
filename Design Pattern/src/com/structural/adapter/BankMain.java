package com.structural.adapter;

public class BankMain {

	public static void main(String[] args) {
      SbiBank sbi = new SbiBank();
      sbi.getCreditCard();
      sbi.giveBankDetails();

      AxisBank axis = new AxisBank();
//      axis.FindBankName();
//      axis.CheckCreditCard();
      
      CreditCard bank = new BankAdapter(axis);
      bank.getCreditCard();
      bank.giveBankDetails();
	}

}
