package Operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		// increment the value 1
		// pre increment
		
		
	//	System.out.println(++i);  // 11 
		
	//	System.out.println(i); // 11
		
		
		
		// post increment
		
	//	System.out.println(i++);  // 11
	//	System.out.println(i);      // 12
		
		int c = i++ +i+ ++i;  //10+11+12
		System.out.println(c);
		
		
	//	int a = i++ + i++ + ++i;  // 10+11+13
	//	System.out.println(a);
		
	//	int b = ++i + i++ +i+ i++;  // 11+11+12+12//13
	//	  System.out.println(b);
		

	}

}
