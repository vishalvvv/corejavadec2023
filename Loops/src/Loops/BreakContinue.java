package Loops;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				// 0,2,4,6,8
			//	System.out.println(i);
				continue;
				
			}
		//	System.out.println(i);
			
		}
		
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				// 0,2,4,6,8
				System.out.println(i);
				break;
			}
			// System.out.println(i);
		}
		System.out.println("out of loop");
		// break and continue
		// break will exit and come out of the loop
		// continue will skip that particular iteration

	}

}
