package exceptionhandling;
import java.io.IOException;
public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		m1();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
		static void m1() throws IOException {
			throw new IOException();
		}
		
		}
	
	


