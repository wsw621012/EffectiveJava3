package com.lucifer.item3;

public enum EnumSingleton {

	INSTANCE(3);

	private final int id;
	
	private EnumSingleton(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void doSomething() {
		System.out.println("This is enum singleton with id = " + Integer.toString(id));
	}
}
