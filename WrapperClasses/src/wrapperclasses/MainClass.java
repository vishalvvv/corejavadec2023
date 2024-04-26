package wrapperclasses;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test(10,20);
		System.out.println(test);
		System.out.println(test.hashCode());
		Test test1 = new Test(10,20);
		System.out.println(test1);
		System.out.println(test1.hashCode());
		System.out.println(test.equals(test1));
		Integer i=90;
		System.out.println(i.getClass());

	}

}
