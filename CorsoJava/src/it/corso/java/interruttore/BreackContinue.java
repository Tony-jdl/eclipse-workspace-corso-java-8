package it.corso.java.interruttore;

public class BreackContinue {
	
	public void esempioBreak(int interruttore, int estremo) {
		
		for(int i = 0; i < estremo; i++) {
			if(i == interruttore) {
				System.out.println("i==interruttore");
				break;
			}
		}
		System.out.println("ciclo esempio break");
	}

}
