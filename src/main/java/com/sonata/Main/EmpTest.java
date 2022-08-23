package com.sonata.Main;

import com.sonata.Impl.EmpImpl;
import com.sonataModel.Employee;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpTest {
	Employee e1 = new Employee();
	EmpImpl e2 = new EmpImpl();
	@Test
	public void ytest() {
		e1.setEmpSal(1000);
		Assertions.assertEquals(12000,e2.yearlySal(e1));
	}
	@Test
	public void ytest1() {
		e1.setEmpSal(100);
		Assertions.assertEquals(1200,e2.yearlySal(e1));
	}
	@Test
	public void ytest2() {
		e1.setEmpSal(1000);
		Assertions.assertEquals(5000,e2.appSal(e1));
	}
	@Test
	public void ytest3() {
		e1.setEmpSal(1000);
		Assertions.assertEquals(5000,e2.appSal(e1));
	}


}
