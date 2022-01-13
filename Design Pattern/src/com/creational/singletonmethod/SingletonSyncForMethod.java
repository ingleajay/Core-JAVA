package com.creational.singletonmethod;

public class SingletonSyncForMethod {

	private static SingletonSyncForMethod instance;
	private SingletonSyncForMethod() {}
	public static synchronized SingletonSyncForMethod getInstance() {
		if(instance==null) {
			instance = new SingletonSyncForMethod();
		}
		return instance;
	}
}
