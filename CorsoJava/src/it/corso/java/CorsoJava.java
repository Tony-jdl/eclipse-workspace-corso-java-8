package it.corso.java;

import java.io.File;

public class CorsoJava {
	int b = 5; // variabile di istanza
	public static String stampa = "Variabile di classe";

	public static void main(String[] args) {
		
		// variabile di istanza
		CorsoJava c1 = new CorsoJava();
		c1.b = 10;
		
		CorsoJava c2 = new CorsoJava();
		c2.b = 7;

		// variabile di classe
		System.out.println(stampa);
		
		
		
		CorsoJava c3; // dichiarazione
		c3 = new CorsoJava(); // inizializzazione
		
		
	}

	public String concatena(String stringa1, String stringa2, double d, File file) {
		return stringa1.concat(stringa2);
	}
}
