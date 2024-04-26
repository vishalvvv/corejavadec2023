package Variables;

public class Variables {
	int k=20; // instance variable
	static int l=90; // static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;  // local variable
		System.out.println(i);
		System.out.println(l);
		
		// new keyword creating an object with this u can access both static and non static methods and variables 
		// loading of non static method will happen during the object creation 
		Variables v1 = new Variables();
		// accessing a instance variable referencevariable.variablename 
		System.out.println(v1.k);
		// accessing a non static method referencevariable.MethodName()
		v1.m1();
		v1.m2();
		System.out.println(v1.l);
	}
		
		void m1() {
			int j=20;
			System.out.println(j);
			System.out.println(l);
			System.out.println(k);
			
		}
		
		static void m2() {
			int l=30;
			System.out.println(l);
		}

}
