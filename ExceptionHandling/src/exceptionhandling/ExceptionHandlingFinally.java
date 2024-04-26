package exceptionhandling;

public class ExceptionHandlingFinally {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String password = "password";
		try {
			
			password.charAt(7);
		//	System.exit(0);
			int a=10/0;
			
			password=null;
		}
		
		catch(ArithmeticException exception) {
			System.out.println("handled");
			System.out.println(password);
		}
		finally {
			password=null;
			System.out.println(password);
		}

	}

}
