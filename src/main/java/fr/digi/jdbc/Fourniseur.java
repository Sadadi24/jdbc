package fr.digi.jdbc;

public class Fourniseur {
	private int id;
	private String raisonsociale;

	public Fourniseur() {
		// TODO Auto-generated constructor stub
	}

	public Fourniseur(int id, String raisonsociale) {
		super();
		this.id = id;
		this.raisonsociale = raisonsociale;
	}

	public Fourniseur(String raisonsociale) {
		super();
		this.raisonsociale = raisonsociale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRaisonsociale() {
		return raisonsociale;
	}

	public void setRaisonsociale(String raisonsociale) {
		this.raisonsociale = raisonsociale;
	}

}
