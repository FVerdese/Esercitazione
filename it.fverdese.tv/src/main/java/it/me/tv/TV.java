package it.me.tv;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TV {
	
	final static Logger logger = Logger.getLogger(TV.class);
	
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setCanale();
	}
	
	public void logCanale() {
		String canale= "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("INSERISCI UN CANALE");
        try {
			canale = scanner.next();
			scanner.close();
			logger.info("Canale inserito: " + canale);
		} catch (InputMismatchException inputMismatchException) {
			logger.error("Input Mismatch error", inputMismatchException);
		} catch (Exception e){
			logger.fatal("Unexpected error", e);
		}
	}
	
	public void setCanale() {
		String canale= "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("INSERISCI UN CANALE");
        try {
			canale = scanner.next();
			scanner.close();
			logger.info("Canale settato: " + canale);
		} catch (InputMismatchException inputMismatchException) {
			logger.error("Input Mismatch error", inputMismatchException);
		}
	}

}