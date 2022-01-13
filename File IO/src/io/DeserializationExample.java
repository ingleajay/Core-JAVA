package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("F:\\Java\\core java\\src\\com\\io\\output6.txt"));  
		  Patient s=(Patient)in.readObject();  
		  System.out.println("Patient Details : ");
		  System.out.println("Patient id : " + s.pid + "\n" + "Patient Name : " + s.pname);
		  System.out.println("Doctor id : " + s.id + "\n" + "Doctor Name : " + s.name);
		  in.close();  
	}
}
