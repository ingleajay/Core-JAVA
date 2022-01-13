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
		//arithmaticException();
	    //nullPointerException();
	    //numberFormatException();
	    //arrayIndexOutofBoundException();
	    //stringOutofBoundException();
		
		// nestedTryCatchBlock();
		// throwUncheckException(10);
		//throwCheckException();
		
		//throwsKeyword();
		//finalkeyword();
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
		try {
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
