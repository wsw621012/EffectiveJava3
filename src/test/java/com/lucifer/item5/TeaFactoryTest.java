package com.lucifer.item5;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lucifer.drink.Tea;
import com.lucifer.item5.TeaFactory.TeaType;


public class TeaFactoryTest {

	@Test
	public void test_Factory() {

		Tea tea = TeaFactory.create(TeaType.BLACK);
		assertEquals(tea.getClass().getName(), BlackTea.class.getName());
	}

	@Test
	public void test_Kiosk() {
		Tea tea = Kiosk.getTea(TeaType.OOLONG);
		assertEquals(tea.getClass().getName(), OolongTea.class.getName());
	}
}
