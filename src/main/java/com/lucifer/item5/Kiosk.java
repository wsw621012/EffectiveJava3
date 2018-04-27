package com.lucifer.item5;

import com.lucifer.drink.Tea;
import com.lucifer.item5.TeaFactory.TeaType;

public class Kiosk {

	public static Tea getTea(TeaType tt) {
		return TeaFactory.create(tt);
	}
}
