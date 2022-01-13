package com.oops;

import java.util.Scanner;

class Students {
    private int sid;
    private String sname;
    private String sbranch;
    private Address address;
    public int getSid() {
        return sid;
    }
    public int setSid(int sid) {
        return this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public Address getAddress() {
        return address;
    }
    public String getSbranch() {
        return sbranch;
    }
    public void setSbranch(String sbranch) {
        this.sbranch = sbranch;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Students(int sid, String sname, String sbranch, Address address) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.sbranch = sbranch;
        this.address = address;
    }
    public Students() {
        super();
    }
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + ", address=" + address + "]";
    }
}

class Address {
	
    private String city;
    private int zipcode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Address(String city, int zipcode) {
		super();
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcode=" + zipcode + "]";
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Students s = new Students();
        Address a = new Address();
        System.out.println("student data : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll no :");
        int sid = sc.nextInt();
        System.out.println("Enter your name :");
        String sname = sc.next();
        System.out.println("Enter your branch :");
        String sbranch = sc.next();
        System.out.println("Enter your City :");
        String city = sc.next();
        System.out.println("Enter your Zipcode :");
        int zip = sc.nextInt();
        s.setSid(sid);
        s.setSname(sname);
        s.setSbranch(sbranch);
        s.setAddress(new Address (city,zip));
        System.out.println("\nStudent profile : ");
        System.out.println("Roll No : " + s.getSid());
        System.out.println("Name : " + s.getSname());
        System.out.println("Branch : " + s.getSbranch());
        System.out.println("city : " + s.getAddress());
        System.out.println("zipcode : " + s.getAddress().getZipcode());
	}
}
