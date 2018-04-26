package com.lucifer.item2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Test;

public class BadCategoryTest {

	@Test
	public void test() {
		int id = 1;
		String mark = "Woolong";
		LocalDate expiration = LocalDate.now().plusYears(2);  
		int cost = 10;
		int capacity = 350;
		BadCategory c = new BadCategory.Builder().withId(id).withMark(mark).withExpiration(expiration).withCost(cost).withCapacity(capacity).build();
		assertEquals(c.getId(), 1);
		assertEquals(c.getMark(), mark);
		assertEquals(c.getExpiration(), expiration);
		assertEquals(c.getCost(), cost);
		assertEquals(c.getCapacity(), capacity);
	}

	@Test
	public void testAsLackParams() {
		int id = 1;
		String mark = "Woolong";
		LocalDate expiration = LocalDate.now().plusYears(2);  
		int cost = 10;
		int capacity = 350;
		BadCategory c = new BadCategory.Builder().withId(id).withExpiration(expiration).withCapacity(capacity).build();
		assertEquals(c.getId(), 1);
		assertEquals(c.getExpiration(), expiration);
		assertEquals(c.getCapacity(), capacity);
		
		assertNotEquals(c.getMark(), mark);
		assertNotEquals(c.getCost(), cost);
		
		c.setMark(mark);
		assertEquals(c.getMark(), mark);
		
		c.setCost(cost);
		assertEquals(c.getCost(), cost);
		
	}
}
