package collections;
import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		System.out.println(list);
		list.remove(1);
		list.add(3,100);
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list);
	//	for(int i=0;i<list.size();i++) {
		//	System.out.print(list.get(i));
	//	}

	}

}
