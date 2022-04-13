package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		// used for writing data to a file and it’s character-oriented data
		FileOutputStream fout=new FileOutputStream("F:\\Java\\File IO\\src\\io\\output1.txt"); 
		
		// Buffer is used while reading/writing data. 
		// It need not be used while moving data from one place to another.
		// stream is seq of data 
		
		// OutputStreamWriter is a class which is used to convert character stream to byte stream
		BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(fout));
 
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
        System.out.println("success...");   
	}

}
