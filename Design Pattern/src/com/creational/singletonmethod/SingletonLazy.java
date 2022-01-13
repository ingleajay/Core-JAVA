package com.creational.singletonmethod;

public class SingletonLazy {
	// Lazy instalisation
	private static SingletonLazy instance;
	private SingletonLazy() {}
	public static SingletonLazy getInstance() {
		if(instance==null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
