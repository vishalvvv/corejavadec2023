package collections;
import java.util.List;
import java.util.LinkedList;

public class LinkedlistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.remove(3);
		list.add(3,100);
		System.out.println(list.get(3));
		System.out.println(list);

	}
 
}

//adding and removing an element is faster in linkedlist
	// fetching an element in a particular index is faster
