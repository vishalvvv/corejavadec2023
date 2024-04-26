package interfaces;

abstract class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondSubClass second = new SecondSubClass();
	     second.m1();
	     second.m2();
	     second.m3();

	}
     abstract void m1();
     void m2() {
    	 System.out.println("m2");
     }
}
