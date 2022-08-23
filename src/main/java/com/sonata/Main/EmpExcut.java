package com.sonata.Main;

import com.sonata.Impl.*;
import com.sonataModel.*;

public class EmpExcut {
	
	public static void main(String[] arg) {
		Employee e1 = new Employee();
		e1.setEmpId(123);;
		e1.setEmpName("Rishav");
		e1.setEmpSal(1000);
		EmpImpl e2 = new EmpImpl();
		System.out.println(e2.yearlySal(e1));
		System.out.println(e2.appSal(e1));
		
		
	}

}
