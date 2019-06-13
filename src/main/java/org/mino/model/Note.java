package org.mino.model;

public class Note {
	private int idNote;
	private Matiere matiere;
	private Double valeur;
	private Etudiant etudiant;
	
	public Note()
	{}
	
	public Note(int id, Double note)
	{
		this.setIdNote(id);
		this.valeur = note;
		this.matiere = new Matiere();
		this.etudiant = new Etudiant();
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Double getValeur() {
		return valeur;
	}

	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}

	public int getIdNote() {
		return idNote;
	}

	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}

}
