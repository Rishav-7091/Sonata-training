 package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Calculator;

@SpringBootTest
class SonatatrainingApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void divTest() {
		Calculator c3 = new Calculator();
		int x = c3.div(10, 10);
		assertThrows(ArithmeticException.class,()->c3.div(10,0),"it is error");
	}
	//@Test
	public void divTest1() {
		Calculator c3 = new Calculator();
		int x = c3.div(10, 10);
		assertThrows(ArithmeticException.class,()->c3.div(10,10),"it is error");
	}
}