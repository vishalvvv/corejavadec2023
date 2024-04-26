package Operator;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// AND (&&)
		System.out.println(10>8 && 9>=9); // t and t ==> t
		
		System.out.println(10>8 && 8>=9);  //  t and f ==> f
		
		// OR(||)
			// age <=6 or age>=60// t or f==>
		
		int age =3;
		boolean b =age<=6 || age>=60;
		System.out.println(b);
		
		// NOT(!)
		
		System.out.println(!(age<=6 || age>=60));

	}

}
