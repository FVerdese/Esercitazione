package it.corso.junitTest.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class EventoTest {
	
	@Test
	void constructTest() {
		Evento evento = new Evento();
		assertEquals(evento.getClass(), Evento.class);
		
		Evento evento2 = new Evento("Test", "Evento di test", 10, 10, 2010);
		assertNotEquals(evento, evento2);
	}
	
	@Test
	void testNome() {
		String s = "Test";
		Evento evento = new Evento();
		evento.setNome(s);
		assertEquals(s, evento.getNome());
	}
	
	@Test
	void testDescrizione() {
		String s = "Test";
		Evento evento = new Evento();
		evento.setDescrizione(s);
		assertEquals(s, evento.getDescrizione());
	}
	
	@Test
	void testGiorno() {
		int i = 5;
		Evento evento = new Evento();
		evento.setGiorno(i);
		assertEquals(i, evento.getGiorno());
	}
	
	@Test
	void testMese() {
		int i = 5;
		Evento evento = new Evento();
		evento.setMese(i);
		assertEquals(i, evento.getMese());
	}
	
	@Test
	void testAnno() {
		int i = 2020;
		Evento evento = new Evento();
		evento.setAnno(i);
		assertEquals(i, evento.getAnno());
	}

}
