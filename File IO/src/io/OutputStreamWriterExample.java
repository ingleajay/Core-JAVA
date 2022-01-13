package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
	    OutputStream outputStream = new FileOutputStream("F:\\Java\\core java\\src\\com\\io\\output4.txt");  
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
        outputStreamWriter.write("Hello World");  
        outputStreamWriter.close();  
	}

}
