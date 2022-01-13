package com.creational.factorymethod;

public class Axis implements Bank{
	
	@Override
	public void getROI() {
		float ROI = 8.8f;
		System.out.println("Axis ROI is " + ROI );
	}
}
