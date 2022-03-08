package com.oops.packages1;

public class PublicAccessIfscCode {
	
	// public modifier 
	/* 
	 Packages : 

Need of packages : 1. java.util.Date  2. java.sql.Date

1. Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces
2. Preventing naming conflicts -  packages, college.staff.cse.Employee and college.staff.ee.Employee
3. Providing controlled access to variables and classes and methods.
4.  A package is a container of a group of related classes where some of the classes 
    are accessible are exposed and others are kept for internal purpose.
5. ex. college.staff.cse ⇒ there are three directories, college, staff and cse such that cse is present 
   in staff and staff is present college.
6. Package naming conventions  -  Packages are named in reverse order of domain names like
   com.codeouter.javacourses
7. There are built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
8. User-defined packages : 
    - if not used ide then -
         -  complie - javac -d directory javafilename   - > javac -d . Simple.java
         -   run -  java mypack.Simple
9. Access package from another package:
     - import package.*;
     - import package.classname;
     - fully qualified name.
10. Using Static Import - ( java 5 and above)

Access modifiers in Java helps to restrict the scope of a class, constructor, variable, method, or data member. 
Non-access modifiers : In java, we have 7 non-access modifiers.
static , final , abstract , synchronized , transient , volatile ,native



	 */

	public static void main(String[] args) {
		
		// 2. Public Modifier :   The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, 
		// within the package and outside the package.
		
		PublicSbiBank sbi = new PublicSbiBank();
		sbi.display();
	}
}
