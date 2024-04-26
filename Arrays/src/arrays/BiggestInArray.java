package arrays;

public class BiggestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,78,10,20,30,90,50};
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
