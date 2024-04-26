package Loops;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nested loops => it is an implementation of loops 
		// loop inside another loop is termed as nested loop
		int n=6;
		for(int i=1;i<n;i++) {
		//	System.out.println("* * * * *");
			// * * * * *
			for(int j=1;j<n;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
