package com.lucifer.item1;

import com.lucifer.drink.Drink;

public class DrinkFactory {

	public static <T extends Drink> Drink create(Class<T> t) throws InstantiationException, IllegalAccessException {
		return t.newInstance();
	}
}
