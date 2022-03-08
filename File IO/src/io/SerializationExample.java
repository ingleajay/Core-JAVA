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
		
		/* 
		 Need:
		 Serialization in Java allows us to convert an Object to stream that we can send over 
		 the network or save it as file or store in DB for later usage. 
		  
	
		 1. Serialization in Java is a mechanism of writing the state of an object into a byte-stream.
		2. The reverse operation of serialization is called deserialization where byte-stream is converted into an object.
		3. serializing the object, we call the writeObject() method of ObjectOutputStream class
		4. for deserialization we call the readObject() method of ObjectInputStream class.
		5. The String class and all the wrapper classes implement the java.io.Serializable interface by default.
		
		Transient keyword : 
        If you don't want to serialize any data member of a class, you can mark it as transient.
         When to use of transient  : 
         if a program accepts a user's login details and password. 
         But we don't want to store the original password in the file.
		 * */
		  Patient s1 =new Patient(211,"Ravi",101,"Ajay");   
		  FileOutputStream fout=new FileOutputStream("F:\\Java\\core java\\src\\com\\io\\output6.txt"); 
		  ObjectOutputStream out=new ObjectOutputStream(fout);   
		  out.writeObject(s1);   
		  out.flush();    
		  out.close();    
		  System.out.println("success"); 
	}
}
