package com.lucifer.exec;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColumnSetTest {

	@Test
	public void test() {
		ColumnSet columns = new ColumnSet();
		
		columns.setString("field_1", "ABC");
		assertEquals(columns.getString("field_1"), "ABC");
		assertEquals(columns.getValue("field_1", String.class), "ABC");
		
		columns.setValue("field_2", Integer.valueOf(10));
		assertEquals(columns.getValue("field_2", Integer.class), Integer.valueOf(10));
	}

}
