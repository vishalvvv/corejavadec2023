package fundamentals;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=132;
		byte b=(byte)i; //  128+1==> -127+3
		System.out.println(b);
		int j=256;
		byte c =(byte)j;  // 128+1 ==> -127+127
		System.out.println(c);
		
		
		// char->int
		
		char d='=';
		int k=d;
		System.out.println(k);
		
		// int-> char narrow
		
		int l=89;
		char e = (char)l;
		System.out.println(e);

	}

}
