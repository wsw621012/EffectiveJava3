package com.lucifer.item3;

public class SimpleSingleton {

	public final static SimpleSingleton INSTANCE = new SimpleSingleton();
	
	private final int id;
	
	private SimpleSingleton() { 
		id = 1;
	}
	
	public int getId() {
		return id;
	}
	
	public void doSomething() {
		System.out.println("This is Simple Singleton with id = " + Integer.toString(id));
	}
}
