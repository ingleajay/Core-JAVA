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
		
		User u = new User(101, "Ajay Ingle");
		User b = (User)u.clone();
		
		System.out.println(b.user_id);
        System.out.println(b.user_name);
	}

}
