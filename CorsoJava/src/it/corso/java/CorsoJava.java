package it.corso.java;

import java.io.File;

import it.corso.java.ciclo.ForWhileDoWhile;
import it.corso.java.condizionali.IfElseSwitchCase;
import it.corso.java.interruttore.BreackContinue;

public class CorsoJava {
	int b = 5; // variabile di istanza
	public static String stampa = "Variabile di classe";

	public static void main(String[] args) {
		
		BreackContinue bc = new BreackContinue();
		bc.esempioBreak(10, 20);
		
//		ForWhileDoWhile ciclo = new ForWhileDoWhile();
//		ciclo.itera(0, 20);
//		ciclo.iteraDoWhile(0, 20);
//		
//		String[] arr = new String[] {"testo1", "testo2", "testo3", "testo4", "testo5"};
//		ciclo.iteraFor(arr);
		
//		IfElseSwitchCase test = new IfElseSwitchCase();
//		System.out.println(test.recuperaIlMaggiore(5, 10, 15));
//		
//		System.out.println(test.recuperoTesto(2));
		
//		// variabile di istanza
//		CorsoJava c1 = new CorsoJava();
//		c1.b = 10;
//		
//		CorsoJava c2 = new CorsoJava();
//		c2.b = 7;
//
//		// variabile di classe
//		System.out.println(stampa);
//		
//		
//		
//		CorsoJava c3; // dichiarazione
//		c3 = new CorsoJava(); // inizializzazione
//		
//		int val1 = 0;
//		System.out.println(val1);
//		
//		double d = 0;
//		System.out.println(d);
//
//		String test = "prova di stampa";
//		byte[] testAr = test.getBytes();
//		
//		for(int i=0; i < test.length(); i++) {
//			System.out.println(testAr[i]);
//		}
//		
//		int val2 = 10;
//		int val3 = 20;
//		
//		Calcolatrice c = new Calcolatrice();
//		System.out.println("Risultato somma di val2 + val3 = " + c.somma(val2, val3));
//		
//		float f1 = 100.45f;
//		float f2 = -10.50f;
//		
//		float sommaf = f1+f2;
//		System.out.println("Somma float = " + sommaf);
//		
//		double d1 = 100.45;
//		double d2 = -10.50;
//		
//		double sommad = d1 + d2;
//		System.out.println("Somma double = " + sommad);
//		
//		char ch1 = 'a';
//		char ch2 = 'b';
//		
//		char ch3 = (char) (ch1 + ch2);
//		System.out.println(ch3);
//		
//		String strTest = "prova";
//		System.out.println(strTest+ch3);
	}

	public String concatena(String stringa1, String stringa2, double d, File file) {
		return stringa1.concat(stringa2);
	}
	
	public String concatena(String... vars) {
		String out = "";
		
		for (int i = 0; i < vars.length; i++) {
			out += vars[i];
		}
		
		return out;
	}
}
