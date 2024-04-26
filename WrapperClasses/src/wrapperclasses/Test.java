package wrapperclasses;

public class Test {
	
	public Test(int i,int j) {
		
		this.i=i;
		this.j=j;
	
	
  }
	private int i;
	private int j;
	
	@Override
	public String toString() {
		return "Test [i=" + i + ", j=" + j + "]";
	}
	
	@Override
	public int hashCode() {
		return 12234;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(this == obj) {
		return true;
	}
	Test test = (Test)obj;
	
	if(test.i == this.i && test.j == this.j) {
		return true;
	}
	return false;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("garbage collected");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	/*
	@Override
	
	public String toString() {
		System.out.println("tostring of test called");
		return "{i:"+i+"j:"+j+"}";
		
	}
	*/
}
