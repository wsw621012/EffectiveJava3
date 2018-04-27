package com.lucifer.item2;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class CategoryTest {

	@Test
	public void test_WorstCategory() {
		LocalDate expiration = LocalDate.now().plusYears(2);

		// hard to read.
		WorstCategory c0 = new WorstCategory(1, "woolong", expiration, 10, 350);

		assertEquals(c0.getId(), 1);
		assertEquals(c0.getMark(), "woolong");
		assertEquals(c0.getExpiration(), expiration);
		assertEquals(c0.getCost(), 10);
		assertEquals(c0.getCapacity(), 350);

		int id = 1;
		String mark = "Woolong";
		int cost = 10;
		int capacity = 350;

		// alternate with temporary variables.
		WorstCategory c1 = new WorstCategory(id, mark, expiration, cost, capacity);

		assertEquals(c1.getId(), id);
		assertEquals(c1.getMark(), mark);
		assertEquals(c1.getExpiration(), expiration);
		assertEquals(c1.getCost(), cost);
		assertEquals(c1.getCapacity(), capacity);
	}

	@Test
	public void test_FakeBuilder() {
		
		LocalDate expiration = LocalDate.now().plusYears(2);
		
		BadCategory c = new BadCategory.FakeBuilder().id(1).mark("Woolong").expiration(expiration)
				.cost(10).capacity(350).build();
		assertEquals(c.getId(), 1);
		assertEquals(c.getMark(), "Woolong");
		assertEquals(c.getExpiration(), expiration);
		assertEquals(c.getCost(), 10);
		assertEquals(c.getCapacity(), 350);
	}

	@Test
	public void test_FakeBuilder_AsParamsLack() {

		String mark = "Woolong";
		LocalDate expiration = LocalDate.now().plusYears(2);

		BadCategory c = new BadCategory.FakeBuilder().id(1).expiration(expiration).capacity(350).build();
		assertEquals(c.getId(), 1);
		assertEquals(c.getExpiration(), expiration);
		assertEquals(c.getCapacity(), 350);

		assertNotEquals(c.getMark(), mark);
		assertNotEquals(c.getCost(), 10);

		c.setMark(mark);
		assertEquals(c.getMark(), mark);

		c.setCost(10);
		assertEquals(c.getCost(), 10);

	}

	@Test
	public void test_Category_AsStaticFactoryMethod() {

		// not permitted.
		// Category c = new Category.Builder(1, "woolong").build();

		Category c = Category.newBuilder(1, "woolong").expiration(LocalDate.now().plusYears(2)).cost(30).capacity(500)
				.build();

		assertEquals(c.getId(), 1);
		assertEquals(c.getMark(), "woolong");
		assertEquals(c.getCost(), 30);
		assertEquals(c.getCapacity(), 500);
	}

}
