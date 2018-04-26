package com.lucifer.item2;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class CategoryTest {

	@Test
	public void test() {
		int id = 1;
		String mark = "Woolong";
		LocalDate expiration = LocalDate.now().plusYears(2);
		int cost = 10;
		int capacity = 350;
		Category c = new Category.Builder(id, mark).build();
		assertEquals(c.getId(), 1);
		assertEquals(c.getMark(), mark);
		assertEquals(c.getExpiration(), expiration);
		assertEquals(c.getCost(), cost);
		assertEquals(c.getCapacity(), capacity);
	}

}
