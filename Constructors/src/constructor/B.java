package constructor;

public class B {
	int a;
	int b;
	
	public B() {
		System.out.println("this is the constructor for class B");
		this.a=10;
		this.b=20;
	}
	public B(int i,int j) { // 20,60
		System.out.println("2 int values");
		this.a=i;
		this.b=j;
	}

}
