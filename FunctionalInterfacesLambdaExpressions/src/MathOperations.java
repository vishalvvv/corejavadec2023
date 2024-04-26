interface MathOperation{
	int operate(int a,int b);
}
public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperation addition = (int a,int b) -> a+b;
		MathOperation subtraction = (int a,int b) -> a-b;
		MathOperation multiplication = (int a,int b) -> a*b;
		MathOperation division = (int a,int b) -> a/b;
		
		System.out.println("Addition: " + performOperation(addition, 10,15));
		System.out.println("Subtraction: " + performOperation(subtraction, 15,10));
		System.out.println("multiplication: " + performOperation(multiplication, 15,5));
		System.out.println("Division: " + performOperation(division, 10,2));
		
	}
		
	
	public static int performOperation(MathOperation operation,int a,int b) {
		return operation.operate(a,b);
	}
	

}
