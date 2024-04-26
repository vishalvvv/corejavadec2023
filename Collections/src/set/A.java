package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(99);
		set.add(49);
		set.add(20);
		set.add(30);
		set.add(20);
		System.out.println(set);
		System.out.println(set.contains(10));
		set.remove(30);
		System.out.println(set);
		System.out.println(set.size());
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
