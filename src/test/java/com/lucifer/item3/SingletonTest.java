package com.lucifer.item3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test_SimpleSingleton() {
		SimpleSingleton.INSTANCE.doSomething();
		assertEquals(SimpleSingleton.INSTANCE.getId(), 1);
	}
	
	@Test
	public void test_NormalSingleton() {
		NormalSingleton.getInstance().doSomething();
		assertEquals(NormalSingleton.getInstance().getId(), 2);
	}
	
	@Test
	public void test_EnumSingleton() {
		EnumSingleton.INSTANCE.doSomething();
		assertEquals(EnumSingleton.INSTANCE.getId(), 3);
	}
	
	@Test
	public void test_BillPughSingleton() {
		BillPughSingleton.getInstance().doSomething();
		assertEquals(BillPughSingleton.getInstance().getId(), 4);
	}

}
