package com.oops.packages2;

//import com.oops.packages1.FirstPack; -> using packname.classname
import com.oops.packages1.*; // -> packname.*

public class SecondPack {

	public static void main(String[] args) {
		
		FirstPack f = new FirstPack();
		f.msg();
		
		// fully qualified name
		com.oops.packages1.FirstPack f1 = new com.oops.packages1.FirstPack();
		f1.msg();
	}
}
