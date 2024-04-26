package Methods;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods methods = new Methods();
		System.out.println("y:"+methods.y);
      A a = new A();
      System.out.println(a.sum('o', 10));
	}
	
	int sum(char a,char b) {
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		return a+b;
	}

	
	
	
	int sum(int a,int b) {
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		return a+b;
	}

}
