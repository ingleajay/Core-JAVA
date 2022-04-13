package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
		// OutputStreamWriter -  used to convert character stream to byte stream
	    OutputStream outputStream = new FileOutputStream("F:\\Java\\File Io\\src\\io\\output4.txt");  
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
        outputStreamWriter.write("Welcome to codeouter."); 
        outputStreamWriter.write(String.valueOf(100));
        outputStreamWriter.write(65); // store character
        outputStreamWriter.write(new char[]{'P','B','C'});
        outputStreamWriter.write("Manohar", 2, 5); 
        outputStreamWriter.close(); 
        System.out.println("Success");
	}
}
