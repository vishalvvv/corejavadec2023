package Final;

public class SubClass extends FinalMethod {
	
	@Override
	void walk() {
		
		System.out.println("walking");
	}
	
	@Override
	
	final void run() {
		// this will throw compile time error
		// overriding a final method is not possible
	}
	

}
