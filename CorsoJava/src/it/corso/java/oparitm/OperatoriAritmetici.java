package it.corso.java.oparitm;

public class OperatoriAritmetici {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = a + b;
		
		System.out.println(c);
		System.out.println(a+b);
		
		if(a > b && b <= 20) {
			System.out.println("a > b && b <= 20");
		}
		
		if (a > b) {
			System.out.println("a > b");
		}
		
		if (!(a>b)) {
			System.out.println("!(a>b)");
		}
		
		if (a != b) {
			System.out.println("a != b");
		}
		
		if (a == b) {
			System.out.println("a == b");
		}
		
		long l1 = a; // cast implicito
		int d = (int) l1; // cast esplicito
	}

}
