package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class VehicleComposite implements VehicleComponent {

	String name;
	
	public VehicleComposite(String name) {
		super();
		this.name = name;
	}

	List<VehicleComponent> vehicle = new ArrayList<VehicleComponent>();
	
	public void addVehicleComponent(VehicleComponent vehicleComponent) {
		vehicle.add(vehicleComponent);
	}
	
	@Override
	public void showVehiclePrice() {
		System.out.println("Name of Vehicle : " + name);
		for(VehicleComponent v : vehicle) {
			v.showVehiclePrice();
		}
	}

}
