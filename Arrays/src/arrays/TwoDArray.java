package arrays;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] arr= {{1,2,7,6},{2,3,4},{4,5},{6,7}};
  //  System.out.println(arr[3][0]);
  //  System.out.println(Arrays.toString(arr[3]));
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		System.out.print(arr[i][j]);
    	}
    	System.out.println();
    }
	}

}
