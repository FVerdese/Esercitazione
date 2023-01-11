package it.corso.junitTest.model;

import java.util.List;

public class Calendario {
	
	private String nome;
	private String descrizione;
	private List<Evento> eventi;
	
	//Costruttori
	public Calendario(String nome, String descrizione, List<Evento> eventi) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.eventi = eventi;
	}

	public Calendario() {
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

	public List<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
	public void addEvento(Evento evento) throws Exception {
		if(eventi.contains(evento)) {
			throw new Exception("Errore: evento già in calendario");
		}
		else {
			eventi.add(evento);
		}
	}
	
	public void removeEvento(Evento evento) throws Exception {
		if(eventi.contains(evento)) {
			eventi.remove(evento);
		}
		else {
			throw new Exception("Errore: l'evento non è in calendario");
		}
	}
	
	public void listEventi() {
		int i = 0;
		while(i < eventi.size()) {
			System.out.println(eventi.get(i).getNome() + ", " + eventi.get(i).getGiorno() + "/" + 
					eventi.get(i).getMese() + "/" + eventi.get(i).getAnno() + "\n" + 
					"Descrizione: " + eventi.get(i).getDescrizione());
			i += 1;
		}
	}

}
