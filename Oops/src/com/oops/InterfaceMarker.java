package com.oops;

class User implements Cloneable
{
    int user_id;
    String user_name;

    public User(int user_id,String user_name)
    {
        this.user_id = user_id;
        this.user_name = user_name;
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class InterfaceMarker {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*
		// It is also known as a tagging interface and is used to indicate or inform the 
		   JVM that a class implementing this interface will have some special behaviour.
		Marker interface in Java
			1. It is an empty interface (no field or methods)
			2. Examples of marker interface are Serializable, Cloneable
		Cloneable interface :
			1. Cloneable interface is present in java.lang package.
			2. There is a method clone() in Object class
			3. A class that implements the Cloneable interface indicates that it is legal for clone()
			 method to make a field-for-field copy of instances of that class.
        */
		
		User u = new User(101, "Ajay Ingle");
		User b = (User)u.clone();
		
		System.out.println(b.user_id);
        System.out.println(b.user_name);
	}

}
