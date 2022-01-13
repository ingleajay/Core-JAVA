package com.creational.factorymethod;

public class SBI implements Bank {

	@Override
	public void getROI() {
		float ROI = 9.5f;
		System.out.println("SBI ROI is " + ROI);
	}
}
