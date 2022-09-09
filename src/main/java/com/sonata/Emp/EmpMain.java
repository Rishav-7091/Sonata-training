package com.sonata.Emp;
import com.sonata.DAOImpl.*;

import com.sonata.Model.Employee;

public class EmpMain {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpid(12);
		e1.setEmpname("Rishav");
		
		EmployeeImpl p1 = new EmployeeImpl();
		int a1 = p1.save(e1);
		System.out.println(a1);
	}

}
