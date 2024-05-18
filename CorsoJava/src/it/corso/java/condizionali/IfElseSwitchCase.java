package it.corso.java.condizionali;

public class IfElseSwitchCase {

	public int recuperaIlMaggiore(int num1, int num2, int num3) {
		int maggiore = 0;
		
		if(num1 > num2 && num1 > num3) {
			maggiore = num1;
		} else if (num2 > num1 && num2 > num3) {
			maggiore = num2;
		} else {
			maggiore = num3;
		}
		
		return maggiore;
	}
	
	public String recuperoTesto(int codice) {
		String testo = null;
		
		switch (codice) {
		case 1:
			testo = "codice 1";
			break;
		case 2:
			testo = "codice 2";
			break;
		case 3:
			testo = "codice 3";
			break;
		default:
			break;
		}
		
		return testo;
	}

}
