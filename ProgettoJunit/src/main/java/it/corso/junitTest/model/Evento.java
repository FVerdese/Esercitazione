package it.corso.junitTest.model;

public class Evento {
	
	private String nome;
	private String descrizione;
	private int giorno;
	private int mese;
	private int anno;
	
	//Costruttori
	public Evento(String nome, String descrizione, int giorno, int mese, int anno)  throws IllegalArgumentException {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		if (giorno >= 1 && giorno <=31) {
			this.giorno = giorno;
			}
			else {
				throw new IllegalArgumentException("Valore del giorno invalido");
			}
		if (mese >= 1 && mese <= 12) {
			this.mese = mese;
			}
			else {
				throw new IllegalArgumentException("Valore del mese invalido");
			}
		this.anno = anno;
	}

	public Evento() {
		super();
	}

	//Getters & setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) throws IllegalArgumentException {
		if (giorno >= 1 && giorno <=31) {
		this.giorno = giorno;
		}
		else {
			throw new IllegalArgumentException("Valore del giorno invalido");
		}
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) throws IllegalArgumentException {
		if (mese >= 1 && mese <= 12) {
		this.mese = mese;
		}
		else {
			throw new IllegalArgumentException("Valore del mese invalido");
		}
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	
	
	

}
