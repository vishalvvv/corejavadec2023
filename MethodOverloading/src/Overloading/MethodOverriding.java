package Overloading;

public class MethodOverriding {
	// method overriding considered as run time polymorphism
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		A a = new A();
		a.m1();
	}

}
