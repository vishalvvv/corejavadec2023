package set;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(99);
		set.add(49);
		set.add(20);
		set.add(30);
		set.add(20);
		System.out.println(set);
	Iterator<Integer> itr = set.iterator();
	// System.out.println(itr.hasNext());
//	System.out.println(itr.next());
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

	}

}
