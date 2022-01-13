package com.creational.singletonmethod;

public class SingletonSyncForBlock {

	private static SingletonSyncForBlock instance;
	private SingletonSyncForBlock() {};
	public static SingletonSyncForBlock getInstance() {
		if(instance==null) {
			synchronized (SingletonSyncForBlock.class) {
				if(instance==null) {
					instance = new SingletonSyncForBlock();
				}
			}
		}
		return instance;
	}
}
