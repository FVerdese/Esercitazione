package it.corso.junitTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import it.corso.junitTest.model.Calendario;
import it.corso.junitTest.model.Evento;

public class Main {
	
	final static Logger logger = Logger.getLogger(Main.class);
	
    public static void main(String[] args) {
    	
    	logger.info("Operazione avviata");

    	try {
    		Scanner scanner = new Scanner(System.in);
        
    		System.out.println("Inserisci nome evento");
    		String nome = scanner.nextLine();
    		System.out.println("Inserisci descrizione evento");
    		String descrizione = scanner.nextLine();
    		System.out.println("Inserisci giorno evento");
    		int giorno = scanner.nextInt();
    		System.out.println("Inserisci mese evento");
    		int mese = scanner.nextInt();
    		System.out.println("Inserisci anno evento");
    		int anno = scanner.nextInt();
        
    		scanner.close();
        
    		Evento evento = new Evento(nome, descrizione, giorno, mese, anno);
    		List<Evento> list = new ArrayList();
    		Calendario cal = new Calendario("Test", "Calendario di test", list);
    		try {
    			cal.addEvento(evento);
    		} catch (Exception e) {
    			logger.error(e);
    		}
    		cal.listEventi();
    		logger.info("Operazione effettuata con successo");
    	} catch (IllegalArgumentException e) {
    		logger.error(e);
    	}
    }

}