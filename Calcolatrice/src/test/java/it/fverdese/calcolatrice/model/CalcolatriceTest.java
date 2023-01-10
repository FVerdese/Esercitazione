package it.fverdese.calcolatrice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

public class CalcolatriceTest {
	
	@Test
	void constructTest() {
		Calcolatrice cal = new Calcolatrice();
		assertEquals(Calcolatrice.class, cal.getClass());
		
		Calcolatrice cal2 = new Calcolatrice();
		assertNotSame(cal, cal2);
	}
	
	@Test
	void sommaTest() {
		double add1 = 5;
		double add2 = 3;
		Calcolatrice cal = new Calcolatrice();
		assertEquals(add1+add2, cal.somma(add1, add2));
	}
	
	@Test
	void sottrazioneTest() {
		double add1 = 5;
		double add2 = 3;
		Calcolatrice cal = new Calcolatrice();
		assertEquals(add1-add2, cal.sottrazione(add1, add2));
	}
	
	@Test
	void divisioneTest() {
		double divnd = 5;
		double divsor = 3;
		Calcolatrice cal = new Calcolatrice();
		assertEquals(divnd/divsor, cal.divisione(divnd, divsor));
	}
	
	@Test
	void moltiplicazioneTest() {
		double fatt1 = 5;
		double fatt2 = 3;
		Calcolatrice cal = new Calcolatrice();
		assertEquals(fatt1*fatt2, cal.moltiplicazione(fatt1, fatt2));
	}
	
	@Test
	void mediaTest() {
		double[] data = {3, 5, 7};
		Calcolatrice cal = new Calcolatrice();
		assertEquals(5, cal.media(data));
	}

}
