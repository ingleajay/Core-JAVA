package com.inner;


//interface to interface, class to interface , interface to class

interface Showable {
    void show();
    interface Message {
        void msg();
    }
}

class InterfaceToInterface implements Showable.Message{

	@Override
	public void msg() {
		System.out.println("I am msg inside showable interface");
	}
}

class TV {
    interface Remote{
        void work();
    }
}

class ClassToInterface implements TV.Remote{

	@Override
	public void work() {
		System.out.println("Remote is working");
	}
}

interface Book{
    class Library implements Book{
    	private String book_name = "Rapid";

		@Override
		public void read() {
			System.out.println("I am reading " + book_name + " book from library");
		}
		
		void write() {
			System.out.println("I am writing a book");
		}
    }
    void read();
}

public class NestedInterface {

	public static void main(String[] args) {
		
		// interface to interface
		Showable.Message msgg = new InterfaceToInterface();
		msgg.msg();
		
		//class to interface
		TV.Remote tv = new ClassToInterface();
		tv.work();
		
		//interface to class
		Book.Library b = new Book.Library();
		b.read();
		b.write();
	}
}
