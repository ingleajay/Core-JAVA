package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Doctor implements Serializable{  
	 transient int id;  
	 String name;  
	 Doctor(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
}

class Patient extends Doctor{
	int pid;
	String pname;
	Patient(int id, String name,int pid,String pname) {
		super(id, name);
		this.pid = pid;
		this.pname = pname;
	}
	
}

public class SerializationExample {

	public static void main(String[] args) throws IOException {
		  Patient s1 =new Patient(211,"Ravi",101,"Ajay");   
		  FileOutputStream fout=new FileOutputStream("F:\\Java\\core java\\src\\com\\io\\output6.txt"); 
		  ObjectOutputStream out=new ObjectOutputStream(fout);   
		  out.writeObject(s1);   
		  out.flush();    
		  out.close();    
		  System.out.println("success"); 
	}
}
