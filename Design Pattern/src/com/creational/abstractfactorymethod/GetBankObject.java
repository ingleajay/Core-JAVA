package com.creational.abstractfactorymethod;

public class GetBankObject {

	public Bank getBankInstance(String str) {
		if(str.equals("SBI"))
			return new SBI();
		else
		    return new Axis();
	}
}
