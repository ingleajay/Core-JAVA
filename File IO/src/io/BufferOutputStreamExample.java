package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// It internally uses buffer mechanism to make the performance fast. 
		//and bufferoutputstream used for buffering an output stream.
		 FileOutputStream fout=new FileOutputStream("F:\\Java\\File IO\\src\\io\\output5.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	       
	     bout.write("Welcome to codeouter.".getBytes()); 
	     
	     
	     String n = String.valueOf(100);
	     byte b1[]=n.getBytes();
	     bout.write(b1);
	     
	     
	     bout.write(65); // store character
	     
	     char[] c = new char[]{'P','B','C'};
	     byte b2[]= new String(c).getBytes();
	     bout.write(b2);
	     
	     bout.write("Manohar".getBytes(), 2, 5);;   
	     
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");  
	}

}
