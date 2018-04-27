package com.lucifer.item3;

/** Thread-Safe **/
public class BillPughSingleton {

	private final int id;
	
	private BillPughSingleton() {
		id = 4;
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	public int getId() {
		return id;
	}
	
	public void doSomething() {
		System.out.println("This is Bill Pugh singleton with id = " + Integer.toString(id));
	}
}
