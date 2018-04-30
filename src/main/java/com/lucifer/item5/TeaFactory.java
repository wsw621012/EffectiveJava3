package com.lucifer.item5;

import java.util.function.Supplier;

import com.lucifer.drink.Drink;
import com.lucifer.drink.Tea;

public class TeaFactory {

	private static final TeaFactory INSTANCE = new TeaFactory();
	
	public static enum TeaType {
		GREEN(GreenTea::new), BLACK(BlackTea::new), OOLONG(OolongTea::new);

		private final Supplier<? extends Tea> ctor;

		private TeaType(Supplier<? extends Tea> ctor) {
			this.ctor = ctor;
		}
	}

	private TeaFactory() { }
	
	public static TeaFactory getInstance() {
		return INSTANCE;
	}
	
	public Tea create(TeaType tt) {
		return tt.ctor.get();
	}
}
