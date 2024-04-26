package set;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {1,2,3,4,1,3,45,6,7,8,89,2,45,6,5};
  Set<Integer> set = new HashSet<Integer>();
  for(int i=0;i<arr.length;i++) {
	  set.add(arr[i]);
  }
  System.out.println(set);
	}

}
