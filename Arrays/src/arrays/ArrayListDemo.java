package arrays;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> tasks = new ArrayList<>();
		tasks.add("Attending the core java class");
		tasks.add("Attending FullStack Demo");
		tasks.add(0,"waking up at 7am");
		tasks.add("Going for a movie");
		tasks.add("playing ps2");
		System.out.println(tasks.size());
		tasks.set(1,"attending core java at 7am");
		tasks.remove(3);
		System.out.println(tasks);
		// tasks.clear();
		
		System.out.println(tasks.isEmpty()+ " " + tasks.size());
		System.out.println(tasks.contains("Attending core java at 7am ..."));
		for(String task: tasks) {
			System.out.println(task);
		}
		
		Iterator<String> iterator = tasks.iterator();
		
		System.out.println("-------------");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
