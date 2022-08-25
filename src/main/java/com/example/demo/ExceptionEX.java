package com.example.demo;


public class ExceptionEX {
	public void div(int a , int b) {
		try{int c = a/b;
		System.out.println(c);
		int d[] = {1,2,3};
		System.out.println(d[2]);
		}catch(ArithmeticException e1) {System.out.println(e1);}
		 catch(ArrayIndexOutOfBoundsException e2) {System.out.println(e2);}
		finally {
			System.out.println("Finally Block");
		}
	}
	
	public void show() {
		System.out.println("This is my program");
	}
	public static void main(String arg[]) {
		ExceptionEX e1 = new ExceptionEX();
		e1.div(10, 10);
		e1.show();
	}
}
