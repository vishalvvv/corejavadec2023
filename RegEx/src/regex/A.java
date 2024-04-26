package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("[\\d]"); //  declaring and compiling a pattern
		Matcher matcher = pattern.matcher("he8llo");
		if(matcher.find()) {
			System.out.println("Match found");
		}
		else {
			System.out.println("Match not found");
		}

	}
	// [\\d]==[0-9]

}
