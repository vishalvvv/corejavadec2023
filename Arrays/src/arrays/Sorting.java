package arrays;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,78,10,20,30,90,50};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
 System.out.println(arr[0]); // for printing min value
 System.out.println(arr[arr.length-1]); // for printing max value
	}

}
