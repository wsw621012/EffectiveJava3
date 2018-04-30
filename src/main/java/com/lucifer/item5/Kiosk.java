package com.lucifer.item5;

import com.lucifer.drink.Tea;
import com.lucifer.item5.TeaFactory.TeaType;

public class Kiosk {

	private final TeaFactory factory;
	
	public Kiosk(TeaFactory factory) {
		this.factory = factory;
	}
	
	public Tea getTea(TeaType tt) {
		return factory.create(tt);
	}
}
