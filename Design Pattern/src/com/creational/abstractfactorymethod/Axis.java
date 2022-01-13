package com.creational.abstractfactorymethod;

public class Axis extends Bank{
	
	@Override
	public void getROI() {
		float ROI = 8.8f;
		System.out.println("Axis ROI is " + ROI );
	}
}
