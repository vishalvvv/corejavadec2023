package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate encapsulate = new Encapsulate();
		encapsulate.setI(0);
		System.out.println(encapsulate.getI());
		// this it represents current object
	//	Encapsulate encapsulate1 = new Encapsulate();
	//	System.out.println(encapsulate1.getI());
		
		encapsulate.setCh('F');
		System.out.println(encapsulate.getCh());

	}

}
