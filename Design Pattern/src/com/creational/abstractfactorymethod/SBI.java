package com.creational.abstractfactorymethod;

public class SBI extends Bank {

	@Override
	public void getROI() {
		float ROI = 9.5f;
		System.out.println("SBI ROI is " + ROI);
	}
}
