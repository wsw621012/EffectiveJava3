package com.lucifer.item5;

import java.util.function.Supplier;

import com.lucifer.drink.Drink;

public class Kiosk {

	public static Drink sell(Supplier<? extends Drink> drinkFactory) {
		return drinkFactory.get();
	}
}
