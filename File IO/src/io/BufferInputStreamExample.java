package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
// Buffered input streams read data from a memory area known as a buffer;
public class BufferInputStreamExample {

	public static void main(String[] args) throws IOException {
		    FileInputStream fin=new FileInputStream("F:\\Java\\core java\\src\\com\\io\\output1.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();  
	}

}
