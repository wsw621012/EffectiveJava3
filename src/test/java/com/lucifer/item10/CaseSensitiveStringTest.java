package com.lucifer.item10;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaseSensitiveStringTest {

	@Test
	public void ReflexitiveTest() {
		CaseSensitiveString s = new CaseSensitiveString("ooo");

		assertTrue(s.equals(s));
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void SymmetricTest() {
		CaseSensitiveString a = new CaseSensitiveString("ooo");
		CaseSensitiveString b = new CaseSensitiveString("ooo");

		assertTrue(a.equals(b));
		assertTrue(b.equals(a));
		
		String c = "ooo";
		assertTrue(a.equals(c));
		assertTrue(c.equals(a));
	}

	@Test
	public void TransitiveTset() {
		CaseSensitiveString a = new CaseSensitiveString("ooo");
		CaseSensitiveString b = new CaseSensitiveString("ooo");
		CaseSensitiveString c = new CaseSensitiveString("ooo");

		assertTrue(a.equals(b));
		assertTrue(b.equals(c));
		assertTrue(c.equals(a));
	}

	@Test
	public void ConsistentTest() {
		CaseSensitiveString x = new CaseSensitiveString("ooo");
		CaseSensitiveString y = new CaseSensitiveString("ooo");

		for (int i = 0; i < 100; i++) {
			assertTrue(x.equals(y));
		}
		
		CaseSensitiveString z = new CaseSensitiveString("xxx");
		for (int i = 0; i < 100; i++) {
			assertFalse(x.equals(z));
		}
	}
	
	@Test
	public void CommonTest() {
		CaseSensitiveString x = new CaseSensitiveString("ooo");
		
		assertFalse(x.equals(null));
	}

}
