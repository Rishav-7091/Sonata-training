package com.sonata.Cal;


import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;
	
public class CalTest {
	
	@Test
	public void addtest() {
		Calculator c1 = new Calculator();
		Assertions.assertEquals(4,c1.add(2, 2));
		Assertions.assertEquals(69,c1.add(49, 20));
	}
	@Test
	public void multest() {
		Calculator c2 = new Calculator();
		Assertions.assertEquals(10,c2.mul(2,5));
		Assertions.assertEquals(100,c2.mul(2,50));
	}
	@Test
	public void divTest() {
		Calculator c3 = new Calculator();
		int x = c3.div(10, 10);
		assertThrows(ArithmeticException.class,()->c3.div(10,0),"it is error");
	}
	@Test
	public void divTest1() {
		Calculator c3 = new Calculator();
		int x = c3.div(10, 10);
		assertThrows(ArithmeticException.class,()->c3.div(10,10),"it is error");
	}
	/*@Test
	public void totalbal() {
		Bank d1 = new Bank();
		d1.balance=489;
		Assertions.assertEquals(500,d1.deposite(11));
	}
	@Test
	public void totalbal1() {
		Bank d1 = new Bank();
		d1.balance=489;
		Assertions.assertEquals(500,d1.deposite(111));
	}
	@Test
	public void totalbal2() {
		Bank d2 = new Bank();
		d2.balance=489;
		Assertions.assertEquals(470,d2.withDraw(19));
	}
	@Test
	public void totalbal3() {
		Bank d2 = new Bank();
		d2.balance=480;
		Assertions.assertEquals(470,d2.withDraw(19));
	}
	*/
		


}
