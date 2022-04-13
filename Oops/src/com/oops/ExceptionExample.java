package com.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class UserDefineException extends Exception{
	private int no;

	public UserDefineException(int no)  
	 {  
	      this.no= no;
	 }
	@Override
	public String toString() {
		return ("There is negative no  = " + no);
	}
}

class ExceptionHandle {
	
	void handleComplieException(){
		arithmaticException();
	    //nullPointerException();
	    //numberFormatException();
	    //arrayIndexOutofBoundException();
	    //stringOutofBoundException();
		//classnotfound();
		
		 //nestedTryCatchBlock();
		//throwUncheckException(10);
		//throwCheckException();
		
		//throwsKeyword();
		//finalkeyword();
	}
	
	private void classnotfound() {
		// TODO Auto-generated method stub
		System.out.println("Class not found");
		
	}

	private void finalkeyword() {
		final int age = 18;  
		// age = 55;
		System.out.println("age : " + age);
	}

	private void throwsKeyword() {

		try {
		    divideNum(45, 0);
		}
		catch(Exception e) {
			 System.out.println("Number cannot be divided by 0");  
		}
	}

	public void  divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        System.out.println(div);
    } 
	
	private void throwCheckException() {
		try {
			FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
	        BufferedReader fileInput = new BufferedReader(file);  
	        throw new FileNotFoundException();  
		}catch(FileNotFoundException e) {
			System.out.println("File is not found : " + e);
		}
	}
	private void throwUncheckException(int age) {
		 if(age < 18)
		    throw new ArithmeticException("student not allowed for party " + age); 
		 else
			 System.out.println("Student allowed for party");
	}
	
	private void nestedTryCatchBlock() {
		
		/* 2. Nested try block : In Java, using a try block inside another try block is permitted.
		Why use nested try block
		Sometimes a situation may arise where a part of a block may cause one error and the 
		entire block itself may cause another error. In such cases, exception handlers have to be nested.
*/
		try {
            System.out.print("I am nested try running...");
            try {
                Number[] a = new Double[2];
                a[0] = 4;
                System.out.println(a[0]);
            } catch (ArrayStoreException as) {
                System.out.println("Inside of nested try: " + as);
            }
            int div = 1/0;
            System.out.println(div);
        } catch (Exception r) {
            System.out.println("Outside of nested try : " + r);
        } finally {
            System.out.println("finally block is always executed in nested...");
        }
	}
	private void arithmaticException() {
		/*1. Multiple Catch Block : A try block can be followed by one or more catch blocks. 
        Why use Multiple Catch Block
        So, if you have to perform different tasks at the occurrence of different exceptions, 
        use java multi-catch block.
 */
		try {
			  String sr = "Manohar";
	            System.out.println(sr.charAt(10));
            int a = 5 / 0;
            System.out.print(a);
          
        } catch (ArithmeticException e) {
            System.out.println("This is arithmetic exception : " + e);
        }
		 catch (Exception ex) {
	        System.out.println("Some other exception..");
	    }
	}
	private void stringOutofBoundException() {
		 try {
	            String sr = "Manohar";
	            System.out.println(sr.charAt(10));
	        } catch (StringIndexOutOfBoundsException st) {
	            System.out.println("String out of bound : "+ st);
	        }
	}
	private void arrayIndexOutofBoundException() {
		try {
            int a[] = new int[3];
            a[4] = 5;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("Array out of index  : " + ar);
        }
	}
	private void numberFormatException() {
		 try {
	            String s = "ajay";
	            int s1 = Integer.parseInt(s);
	            System.out.println(s1);
	        } catch (NumberFormatException ne) {
	            System.out.println("Numberformatexception is " + ne);
	        }
	}
	private void nullPointerException() {
		/* 
		 * 3. Why use Java finally block?
          finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
		 * */
		 try {
	            String str = null;
	            System.out.println(str.length());
	     } catch (NullPointerException n) {
	            System.out.println("NullPointer Exception : " + n);
	     } finally {
	            System.out.println("finally block is always executed in null pointer");
	     }
	}
}

public class ExceptionExample {

	public static void main(String[] args) {
		/* 
		 * Why does an Exception occurs?
           An exception can occur due to several reasons like Network connection problem, Bad input provided by user, 
           Opening a non-existing file in your program etc

			Exception Handling
			1. It’s powerful mechanism to handle the runtime errors so that the normal 
			   flow of the application can be maintained.
			2. In Java, an exception is an event that disrupts the normal flow of the program. 
			   It is an object which is thrown at runtime.
			   
			   Advantage: To maintain the normal flow of the application.
			   
			   Types:
			1. Checked Exception
			     - The classes that directly inherit the Throwable class 
			     - For example, IOException, SQLException, ClassNotFoundException and Error etc. 
			       Checked exceptions are checked at compile-time.
			
			2. Unchecked Exception 
			      - The classes that inherit the RuntimeException
			      - For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
			        UnChecked exceptions are checked at run-time.
			3. Error - Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, 
			          AssertionError etc.

		 * */
		
		ExceptionHandle e  = new ExceptionHandle();
		e.handleComplieException();
		
		// user define exception
		try  
        {    int num = -3;
			 if (num < 1) {  
		            throw new UserDefineException(num);  
		     }  
		     else {  
		            System.out.println("Square of " + num + " is " + (num*num));  
		     }
        }  
        catch (UserDefineException ude)  
        {  System.out.println(ude);
        }  
	}

}
