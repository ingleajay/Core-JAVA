package com.structural.composite;

public class VehicleLeaf implements VehicleComponent {

	int price;
	String name;
	
	public VehicleLeaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	@Override
	public void showVehiclePrice() {
		System.out.println("Vehicle Name : " + name + " " + "Price : " + price);
	}

}
