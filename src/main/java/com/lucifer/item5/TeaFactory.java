package com.lucifer.item5;

import java.util.function.Supplier;

import com.lucifer.drink.Drink;
import com.lucifer.drink.Tea;

public class TeaFactory {

	public static enum TeaType {
		GREEN(GreenTea::new), BLACK(BlackTea::new), OOLONG(OolongTea::new);

		private final Supplier<Tea> ctor;

		private TeaType(Supplier<Tea> ctor) {
			this.ctor = ctor;
		}
	}

	public static Tea create(TeaType tt) {
		return tt.ctor.get();
	}
}
