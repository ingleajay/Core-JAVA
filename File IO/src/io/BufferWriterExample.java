package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("F:\\Java\\core java\\src\\com\\io\\output3.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to codeouter.");  
	    buffer.close();  
	    System.out.println("Success");  
	}

}
