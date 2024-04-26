package Inheritance;

public class B extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.m1();
		B b = new B();
		b.m1();
		b.m4();
		
		System.out.println(b.random);
		b.m2();
		B.m2();
		System.out.println(B.h);
		
		
	//	A a = new A();
		// a.m4(); parent class  cannot access child class 

	}
	
	void m4() {
		System.out.println("m4 called");
	}

}
