package Loops;

public class KPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				if(i+j<=5) {
					System.out.print(" * ");
				}
			}
			System.out.println(" ");
		}
		for(int i=2;i<5;i++) {
			for(int j=1;j<5;j++) {
				if(i>=j) {
					System.out.print(" * ");
				}
				
			}
			System.out.println(" ");
		}

	}

}
