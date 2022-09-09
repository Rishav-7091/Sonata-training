package com.sonata.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sonata.Model.Employee;

@RunWith(Suite.class)
@SuiteClasses({})
public class MainTests {
Employee r1 = new Employee();
	@Test
	public void EmpMain() {
		r1.setEmpid(12);
		assertEquals(12,r1.equals(r1));
	}
}
