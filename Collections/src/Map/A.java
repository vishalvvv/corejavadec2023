package Map;
import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map hashMap = new HashMap<String,String>();
		hashMap.put("EmpId","123456");
		hashMap.put("bloodGroup","o-");
		hashMap.put("Address","Hyderabad");
		System.out.println(hashMap);
		System.out.println(hashMap.get("bloodGroup"));
		hashMap.put("Address", "Secunderabad");
		System.out.println(hashMap);
		System.out.println(hashMap.containsKey("hi"));
		hashMap.put(null,"nullpointer");
		System.out.println(hashMap);
		

	}

}
