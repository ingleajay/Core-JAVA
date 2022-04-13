package io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {

		// FileReader - used to read data from the file. It returns data in byte format.
		FileReader fr=new FileReader("F:\\Java\\File IO\\src\\io\\output2.txt");    
        int i;    
        while((i=fr.read())!=-1)    
           System.out.print((char)i);    
        fr.close();  
	}
}
