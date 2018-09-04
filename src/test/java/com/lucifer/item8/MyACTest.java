package com.lucifer.item8;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyACTest {

	@Test
	public void test_withTry() {
		try (MyAC a = new MyAC()) {
			System.out.println("MyAC create in try scope.");
		} catch (Exception e) {
			fail("test fail.");
		}
	}

	@Test
	public void test_withoutTry() {
		MyAC a = new MyAC();
		System.out.println("MyAC create in open scope.");
	}

	@Test
	public void test_withLoop() {
		for (int i = 0; i < 10; i++) {
			try (MyAC a = new MyAC()) {
				System.out.println(String.format("MyAC create %d time(s).", i));
				System.out.println(a);
			} catch (Exception e) {
				fail("test fail.");
			}
		}
	}

}
