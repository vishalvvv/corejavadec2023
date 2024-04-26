package strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello";
		String s2="hello";
		
	//	String s=" go  OD"  ;
		
		String s1="lear ning";
		String s3 = new String("hello");
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s==s2);
		System.out.println(s==s3);
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s1));
		System.out.println(s.startsWith("hel"));
		System.out.println(s.endsWith("llo"));
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(2));
		String n="hello%all we are%trying split";
		String[] sarr = n.split("%");
		System.out.println(Arrays.toString(sarr));
		System.out.println(n.replace(" ","$"));
		System.out.println(n);
		
		
		

	}

}
