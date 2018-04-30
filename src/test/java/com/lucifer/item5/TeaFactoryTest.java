package com.lucifer.item5;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lucifer.drink.Tea;
import com.lucifer.item5.TeaFactory.TeaType;


public class TeaFactoryTest {

	@Test
	public void test_Factory() {
		TeaFactory factory = TeaFactory.getInstance();
		Tea tea = factory.create(TeaType.BLACK);
		assertEquals(tea.getClass().getName(), BlackTea.class.getName());
	}

	@Test
	public void test_Kiosk() {
		Kiosk k = new Kiosk(TeaFactory.getInstance());
		Tea tea = k.getTea(TeaType.OOLONG);
		assertEquals(tea.getClass().getName(), OolongTea.class.getName());
	}
}
