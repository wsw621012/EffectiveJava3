package com.lucifer.exec;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColumnSetTest {

	@Test
	public void test() {
		ColumnSet columns = new ColumnSet();

		columns.setValue("field_1", "ABC");
		assertEquals(columns.getValue("field_1", String.class), "ABC");

		columns.setValue("field_2", Integer.valueOf(10));
		assertEquals(columns.getValue("field_2", Integer.class), Integer.valueOf(10));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testException() {
		ColumnSet columns = new ColumnSet();
		
		columns.setValue("field_3", Double.valueOf(3.14159));
		columns.getValue("field_3", String.class);
	}
}
