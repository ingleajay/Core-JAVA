package com.oops.packages2;

import com.oops.packages1.DefaultPhoneNo;

public class DefaultAccessPhoneNo {
	
	// default modifier

	public static void main(String[] args) {
		
		// 3. Default Modifier: The access level of a default modifier is only within the package. 
		// It cannot be accessed from outside the package. 
		// If you do not specify any access level, it will be the default.
		
		DefaultPhoneNo a  = new DefaultPhoneNo();
		// System.out.println("My mobile no : " + a.phone); -> error
	}
}
