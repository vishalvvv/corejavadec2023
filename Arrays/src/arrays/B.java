package arrays;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {9,8,78,10,20,30,90,50};
	//	if(arr[0] == 20) {
	//		System.out.println(" 0 index");
	//	}
	//	if(arr[1] == 20) {
	//		System.out.println(" 0 index");
	//	}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==20) {
				System.out.println(i);
			}
		}

	}

}
