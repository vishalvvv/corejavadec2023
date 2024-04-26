package ControlStatements;

public class ExampleCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		// int b=20;
		int b=10;
		
		if(a == b) {
			a=20;
			b=10;
			
		}
		
		else {
			b=100;  // b will be 100
			a=200;  // a will be 200
			
		}
		
		System.out.println(a);  // 200
		System.out.println(b);  // 100

	}

}
