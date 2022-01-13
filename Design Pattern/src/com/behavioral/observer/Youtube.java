package com.behavioral.observer;

public class Youtube {

	public static void main(String[] args) {
		Channel codeouter = new Channel();
		
		Subscriber s1 = new Subscriber("Ajay");
		Subscriber s2 = new Subscriber("Vijay");
		Subscriber s3 = new Subscriber("Sonali");

		codeouter.subscribe(s1);
		codeouter.subscribe(s2);
		codeouter.subscribe(s3);
		
		s1.subscribeChannel(codeouter);
		s2.subscribeChannel(codeouter);
		s3.subscribeChannel(codeouter);
		
		codeouter.unsubscribe(s3);
		
		codeouter.upload("How to find list");

	}

}
