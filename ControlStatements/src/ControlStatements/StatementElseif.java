package ControlStatements;

public class StatementElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// grading system
	// int percentage = 82;
		int percentage=42;
		if(percentage >=90 && percentage <=100) { // f && f ==>f 
			// executes if condition is true
			System.out.println("A+");
		}
		else if(percentage >=70 && percentage <90) { // t  && t ==> t
			// executes if conditional to be false condition2 is true
			System.out.println("A");
		}
		else if (percentage >=50 && percentage<70) {
			// executes if condition1,condition2 to be false
			System.out.println("B");
		}
		else {
			// execute if all the above conditions(condition1,condition2,condition3 is false)
			System.out.println("better luck next time");
		}
		// if any one of the above if else if and else block 
		System.out.println("out of it");

	}
	//	char dept = 'a';
//	if((dept == 'a' && dept == 'b') ||  (dept == 'c' && dept=='d')) {
		
	// }
}
	


