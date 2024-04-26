package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			s.charAt(10);
			int a=10/0;
		}
		catch(NullPointerException exception) {
			System.out.println("handled");
		}
		catch(RuntimeException runtimeException) {
			System.out.println("runtime handled");
		}
		
		catch(Exception exception) {
			System.out.println("cannot divide any number by zero");
		}

	}

}
