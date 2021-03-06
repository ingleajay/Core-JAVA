package com.java8;

class Messages{
	Messages(String msg){
		System.out.println("Motivational Msg : " + msg);
	}
}

interface message{
	public Messages msg(String msg);
}

class MessageImpl implements message{

	@Override
	public Messages msg(String msg) {
		return new Messages(msg);
	}
}


public class ConstructorMethodRef {

	public static void main(String[] args) {
		
		// if let say we have que : 
		// interface -msg object return object and we have class Message then how will you get that message from class
		// -> interface msg() : class Message : class implement msg() : main  
		
		MessageImpl m = new MessageImpl();
		m.msg("Never give up !!");
		
		// use constructor ref
		message ms = Messages :: new;
		ms.msg("if you have love to fly then try to fail ...");
	}

}
