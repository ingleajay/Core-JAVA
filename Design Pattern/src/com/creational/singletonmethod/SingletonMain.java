package com.creational.singletonmethod;

public class SingletonMain {

	public static void main(String[] args) {
		
		// egar output:
		SingletonEgar instance = SingletonEgar.getInstance();
		System.out.println(instance);
		SingletonEgar instance1 = SingletonEgar.getInstance();
		System.out.println(instance1);
		
		// Lazy output
		SingletonLazy instance11 = SingletonLazy.getInstance();
		System.out.println(instance11);
		SingletonLazy instance12 = SingletonLazy.getInstance();
		System.out.println(instance12);
		
		// Thread safe with sync for method
		SingletonSyncForMethod instance13= SingletonSyncForMethod.getInstance();
		System.out.println(instance13);
		SingletonSyncForMethod instance14= SingletonSyncForMethod.getInstance();
		System.out.println(instance14);
		
		// Thread safe with sync for block
		SingletonSyncForBlock instance15= SingletonSyncForBlock.getInstance();
		System.out.println(instance15);
		SingletonSyncForBlock instance16= SingletonSyncForBlock.getInstance();
		System.out.println(instance16);
		
	}
}
