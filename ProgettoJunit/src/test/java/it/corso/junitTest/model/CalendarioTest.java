package it.corso.junitTest.model;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalendarioTest {
	
	@Test
	void addTest() {
		Evento evento = new Evento("Test", "Evento di test", 15, 6, 1990);
		List<Evento> list = new ArrayList();
		Calendario cal = new Calendario("Test", "Calendario di test", list);
		try {
			cal.addEvento(evento);
			assertEquals(evento, cal.getEventi().get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test
	void removeTest() {
		Evento evento = new Evento("Test", "Evento di test", 15, 6, 1990);
		List<Evento> list = new ArrayList();
		Calendario cal = new Calendario("Test", "Calendario di test", list);
		try {
			cal.addEvento(evento);
			cal.removeEvento(evento);
			assertEquals(cal.getEventi(), list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
