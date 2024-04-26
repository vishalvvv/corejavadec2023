package wrapperclasses;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Test test = new Test(10,30);
		Test test1 = new Test(10,20);
		System.out.println(test.equals(test1));
		test=null;
		test1=null;
		System.gc();
		System.out.println("hello");
		Test test3 = (Test) test1.clone();

	}

}
