package com.oops;

class Bank{
    int getROI() {
        return 0;
    }
}

class SBI extends Bank{

	@Override
	int getROI() {
		return 8;
	}
    
}

class ICICI extends Bank{
    int getROI() {
        return 7;
    }
}

class AXIS extends Bank{
    int getROI() {
        return 9;
    }
}

public class OverridingExample {

	public static void main(String[] args) {
		
		SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI ROI : " + s.getROI());
        System.out.println("ICICI ROI: " + i.getROI());
        System.out.println("AXIS ROI: " + a.getROI());
	}

}
