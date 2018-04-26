package com.lucifer.item1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lucifer.drink.Coffee;
import com.lucifer.drink.Drink;
import com.lucifer.drink.Tea;
import com.lucifer.item1.DrinkFactory;

public class DrinkFactoryTest {

	@Test
	public void test() {
		try {
			Drink tea = DrinkFactory.valueOf(Tea.class);
			assertEquals(tea.getClass().getName(), Tea.class.getName());
			
			Drink coffee = DrinkFactory.valueOf(Coffee.class);
			assertEquals(coffee.getClass().getName(), Coffee.class.getName());
			
		} catch (InstantiationException | IllegalAccessException e) {
			fail(e.getMessage());
		}
	}

}
