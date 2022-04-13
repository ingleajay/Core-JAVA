package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		//FileInputStream -  used for reading byte-oriented data
        FileInputStream fin=new FileInputStream("F:\\Java\\File IO\\src\\io\\output1.txt");    
        int i=0;    
        while((i=fin.read())!=-1){    
         System.out.print((char)i);    
        } 
        fin.close();  
	}
}
