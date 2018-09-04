package com.lucifer.item8;

public class MyAC implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("MyAC closed right now.");

	}

}
