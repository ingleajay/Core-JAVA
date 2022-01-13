package com.creational.singletonmethod;

public class SingletonEgar {
	// egar installations
	private static SingletonEgar instance = new SingletonEgar();
	private SingletonEgar() {}
	public static SingletonEgar getInstance() {
		return instance;
	}
}
