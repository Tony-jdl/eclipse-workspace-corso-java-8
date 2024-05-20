package it.corso.java.ciclo;

public class ForWhileDoWhile {
	public void itera(int contatore, int estremo) {
		while (contatore < estremo) {
			System.out.println("contatore vale " + contatore);
			contatore++;
		}
	}
	
	public void iteraDoWhile(int contatore, int estremo) {
		do {
			System.out.println("contatore vale " + contatore);
			contatore++;
		} while (contatore < estremo);
	}
	
	public void iteraFor(int contatore) {
		for (int i = 0; i < contatore; i++) {
			System.out.println(i);
		}
	}
	
	public void iteraFor(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
