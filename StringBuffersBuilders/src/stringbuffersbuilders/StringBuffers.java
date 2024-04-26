package stringbuffersbuilders;

import java.util.GregorianCalendar;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = new GregorianCalendar().getTimeInMillis();
		long startMem = Runtime.getRuntime().freeMemory();
		StringBuffer string = new StringBuffer();
		for (int i=0; i < 1000000; i++) {
			string.append(i);
		}
		long end = new GregorianCalendar().getTimeInMillis();
		long endMem = Runtime.getRuntime().freeMemory();
		System.out.println("time:" + (end - start));
		System.out.println("mem used" + (startMem - endMem));

	}

}
