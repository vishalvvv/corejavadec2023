package Methods;

public class Methods {
	int b=40;
	static int y=90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		System.out.println(y);
		Methods methods = new Methods();
		System.out.println("b:"+methods.b);
		int b=methods.square(a);
		System.out.println(b);
		methods.printSquare(a);
		int c =methods.sum(10, 50, 60);
		// methods.sum(90,80); // passing less or more arguments will throw an error
		System.out.println(c);
		int g=methods.dummy();
		System.out.println(g);
		
		methods.justPrint();
		
	}
		
		int square(int i) {
			System.out.println("square called");
			return i*i;
		}
		void printSquare(int i) {
			System.out.println("print square called");
			System.out.println(i*i);
		}
		int sum(int a,int b,int c) {
			System.out.println("a :"+a);
			System.out.println("b :"+b);
			System.out.println("c :"+c);
			
			return a+b+c;
		}
		
		int dummy() {
			return 4;
		}
		
		void justPrint() {
			System.out.println("justprint method called");
		}
	

	}


