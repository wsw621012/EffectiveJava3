package com.lucifer.item3;

public class NormalSingleton {

	private static final NormalSingleton INSTANCE = new NormalSingleton();
	
	public static NormalSingleton getInstance() { return INSTANCE; }
	
	private final int id;
	
	private NormalSingleton() {
		id = 2;
	}
	
	public int getId() {
		return id;
	}
	
	public void  doSomething() {
		System.out.println("This is normal singleton with id = " + Integer.toString(id));
	}
}
