package Super;

public class B extends A {
	int x=0;
	void m1() {
		System.out.println("m1 in B called");
		System.out.println(x);
		System.out.println(super.x);
	//	super.m1();
	}
	
	void m2() {
		m1();
		super.m1();
	}

}
