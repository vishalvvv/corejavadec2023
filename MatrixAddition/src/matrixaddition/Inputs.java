package matrixaddition;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring a variable
		int a;
		boolean b;
		float f;
		long l;
		System.out.println("enter value of a:");
		
		Scanner scanner = new Scanner(System.in);
		// taking input from console
		// and assigning it
		a=scanner.nextInt();
		System.out.println("enter value of b: ");
		b=scanner.nextBoolean();
		System.out.println("enter value of f: ");
		f=scanner.nextFloat();
		System.out.println("enter value of l: ");
		l=scanner.nextLong();
		// printing the value of a
		System.out.println("the value of a is " +a);
		System.out.println("the value of b is " +b);
		System.out.println("the value of f is " +f);
		System.out.println("the value of l is " +l);
		

	}

}
