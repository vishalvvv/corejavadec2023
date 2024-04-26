package strings;

public class ImmutablityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi";
		String h="hi";
		String h1 = new String("hi");
		String h2 = new String("hi");
		System.out.println(h1.hashCode());
		System.out.println(s.hashCode());
		System.out.println(h.hashCode());
		s="hello";
		System.out.println(s.hashCode());
		System.out.println(h.equals(h2));

	}

}
