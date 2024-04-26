package Overloading;
// method overloading
// having same method but different parameters and arguments
// compile time binding:
// during compile time the method caller will be attached to the method implementation
// polymorphism
// having multiple forms
public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add('s',10));
		System.out.println(add(10,20,30));
		

	}
	static int add(int a,int b) {
		System.out.println("add with 2 ints called");
		return a+b;
	}
	
	static int add(char ch,int b) {
		System.out.println("add with one char and one int called");
		return ch+b;
	}
	
	static int add(int a,int b,int c) {
		System.out.println("add with 3 ints called");
		return a+b+c;
	}

}
