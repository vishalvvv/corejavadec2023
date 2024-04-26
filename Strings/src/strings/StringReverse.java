package strings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="somestring";
		String rev="";
		
		for(int i=0;i<s.length();i++) {
			rev=rev+s.charAt(s.length()-i-1);
			
		}
		System.out.println(rev);
	}

}
