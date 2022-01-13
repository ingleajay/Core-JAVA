package com.structural.composite;

public class VehicleMain {

	public static void main(String[] args) {
      VehicleComposite vehicle = new VehicleComposite("Vehicle");
      
      // car composite
      VehicleComposite car = new VehicleComposite("Car");
      VehicleComposite toyota = new VehicleComposite("Toyota");
      VehicleComposite toyotaBelta = new VehicleComposite("Belta");
      VehicleComposite toyotaHilux = new VehicleComposite("Hilux");
      
      // bike composite
      VehicleComposite bike = new VehicleComposite("Bike");
      VehicleComposite honda = new VehicleComposite("Honda");
      VehicleComposite honda650F = new VehicleComposite("CBR 650F");
      VehicleComposite honda250R = new VehicleComposite("CBR 250R");
      
      // car leaf 
      VehicleComponent Belta = new VehicleLeaf(1200000, "Belta in 2001");
      VehicleComponent Hilux = new VehicleLeaf(1500000, "Hilux in 2005");

      // bike leaf
      VehicleComponent Cbr650 = new VehicleLeaf(1100000, "Cbr 650 in 2000");
      VehicleComponent Cbr250 = new VehicleLeaf(1900000, "Cbr 250 in 2006");

      car.addVehicleComponent(toyota);
      car.addVehicleComponent(toyotaBelta);
      car.addVehicleComponent(toyotaHilux);
      
      bike.addVehicleComponent(honda);
      bike.addVehicleComponent(honda250R);
      bike.addVehicleComponent(honda650F);
      
      toyotaBelta.addVehicleComponent(Belta);
      toyotaHilux.addVehicleComponent(Hilux);
      
      honda250R.addVehicleComponent(Cbr250);
      honda650F.addVehicleComponent(Cbr650);
      
      vehicle.addVehicleComponent(car);
      vehicle.addVehicleComponent(bike);
      
      car.showVehiclePrice();

	
	}

}
