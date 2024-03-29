package it.fverdese.calcolatrice.model;

public class Calcolatrice {
	
	//Costruttore
	public Calcolatrice() {
		
	}
	
	public double somma(double add1, double add2) {
		return add1 + add2;
	}
	
	public double sottrazione(double add1, double add2) {
		return add1 - add2;
	}
	
	public double divisione(double divnd, double divsor) {
		double res = 0;
		if (divsor != 0) {
			res = divnd/divsor;
		}
		else {
			throw new IllegalArgumentException("Illegal argument: / by 0");
		}
		return res;
	}
	
	public double moltiplicazione(double fatt1, double fatt2) {
		return fatt1 * fatt2;
	}
	
	public double media(double[] data) {
		double avg = 0;
		int i = 0;
		while(i < data.length) {
			avg += data[i];
			i += 1;
		}
		avg = avg/data.length;
		return avg;
	}

}
