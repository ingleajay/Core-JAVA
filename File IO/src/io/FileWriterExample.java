package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException {
		/* 
		 * 
		 * 		// 1. Java I/O (Input and Output) is used to process the input and produce the output.
				// 2. File -> Disadv
				       // waste space or memory - want only 1kb data but if we have file we get whole data like 25gb
			           // database - it used database with some memory and use search
				// It need attribte like location - where to read and write
				             // database - it dosn't need anything , user don't know loc
				 // Concurrency - multiple user use one website then problem 
				             // database - server used database to get data
				 // Security - file not provide security and it is access by users/
				             // database - more secure and also fo role based security- data ( student, faculty )
			
			
			2. Java uses the concept of a stream to make I/O operation fast. 
			   The java.io package contains all the classes required for input and output operations.
			3. A stream is a sequence of data. 
			 In Java, a stream is composed of bytes. It's called a stream.5. A stream can be defined as a continuous flow of data.
			4. A Buffer is a portion in the memory that is used to store a stream of data from peripheral devices.
			
			4. Types of stream : 
			        1) System.out: standard output stream
			        2) System.in: standard input stream]
			        3) System.err: standard error stream

		 * */
		
		// It is character-oriented class which is used for file handling in java.
		FileWriter fw=new FileWriter("F:\\Java\\File IO\\src\\io\\output2.txt");
		
        fw.write("Welcome to codeouter."); 
        fw.write(String.valueOf(100));
        fw.write(65); // store character
        fw.write(new char[]{'P','B','C'});
        fw.write("Manohar", 2, 5);
        
        fw.close(); 
        System.out.println("Success..."); 
	}
}
