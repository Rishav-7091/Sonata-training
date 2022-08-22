package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTestCase {

	@Test
	void addtest1() {
		Addinterface add = new DefaultAddition();
		assertEquals(20, add.add(10, 10));
	}
	
	@Test
	void addtest2() {
		Addinterface add = new DefaultAddition();
		assertEquals(0, add.add(1, -1));
	}
	@Test
	void addtest3() {
		Addinterface add = new DefaultAddition();
		assertEquals(2, add.add(2, -1));
	}
}
