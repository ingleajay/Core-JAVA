package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

	public static void main(String[] args) throws IOException {
		
		//  It makes the performance fast. It inherits Writer class

		FileWriter writer = new FileWriter("F:\\Java\\File IO\\src\\io\\output3.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to codeouter."); 
	    buffer.newLine();
	    buffer.write(String.valueOf(100));
	    buffer.newLine();
	    buffer.write(65); // store character
	    buffer.newLine();
	    buffer.write(new char[]{'P','B','C'});
	    buffer.newLine();
	    buffer.write("Manohar", 2, 5);
	    buffer.newLine();
	    buffer.close();  
	    System.out.println("Success");  
	}

}
