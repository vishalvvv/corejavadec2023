package arrays;

public class MinimumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,78,7,20,6,90,50};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
          System.out.println(min);
	}

}
