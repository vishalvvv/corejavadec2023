package ThisSuper;

public class First {
	int x,y;
	
	public First() {   // super class
		this(10,20);
		System.out.println("hello this is no args constructor");
	}
	
	public First(int x,int y) {

		System.out.println("constructor with 2 int values");
		this.x=x;
		this.y=y;
	}

}
