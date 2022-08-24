package ExceptionExample;


public class CallException {
	public static void main(String arg[]) throws MyOwnException {
		int age =2;
		if (age<18) {
			throw new MyOwnException("age is less than 18");
		}
		else {
			System.out.println("Welcome to Vote");
		}
	}

}
