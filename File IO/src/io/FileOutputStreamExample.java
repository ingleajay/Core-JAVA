package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		
		FileOutputStream fout=new FileOutputStream("F:\\Java\\core java\\src\\com\\io\\output1.txt"); 
		// Buffer is used while reading/writing data. 
		// It need not be used while moving data from one place to another.
		// stream is seq of data 
		// BufferWriter: It makes the performance fast. It inherits Writer class. 
		//The buffering characters are used for providing the efficient writing of 
		 //single arrays, characters, and strings.
		// OutputStreamWriter is a class which is used to convert character stream to byte stream
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fout));
		
//			fout.write('c'); 
//			fout.write(65);
//			String name = "Ajay";
//			byte[] n = name.getBytes();
//			fout.write(n);
//			fout.close();  
		bw.write('c'); 
		bw.newLine();
		bw.write(65);
		bw.newLine();
		bw.write("Ajay");
		bw.newLine();
		bw.close();
        System.out.println("success...");   
	}

}
