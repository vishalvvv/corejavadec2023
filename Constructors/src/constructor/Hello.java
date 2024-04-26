package constructor;

public class Hello {
	int i;
	int j;
	// constructor1 with 2 parameters
	public Hello(int i,int j) {
		System.out.println("called the constructor of hello class");
		this.i=i;
		this.j=j;
		
	}
	// constructor2 with one parameter
	public Hello(int i) {
		this(10,60);
		System.out.println("called the constructor with only i");
		this.i=i;
	}

}
