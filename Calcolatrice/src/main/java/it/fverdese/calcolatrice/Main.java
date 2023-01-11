package it.fverdese.calcolatrice;

import it.fverdese.calcolatrice.model.Calcolatrice;

public class Main {

	public static void main(String[] args) {
		
		Calcolatrice cal = new Calcolatrice();
		System.out.println(cal.somma(5, 3));
		System.out.println(cal.divisione(5, 0));

	}

}
