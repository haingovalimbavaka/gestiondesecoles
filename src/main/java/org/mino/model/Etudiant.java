package org.mino.model;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.mino.dao.EtudiantDAO;

public class Etudiant {
	
	private int id_etudiant;
	private String nom_etudiant;
	private String prenom_etudiant;
	private Date date_naissance;
	private Classe classe;
	private List<Note> list_note;

	//private final EtudiantDAO dao;
	private EtudiantDAO dao;
		
	public Etudiant(EtudiantDAO dao) {
		this.dao = dao;
	}
	
	@SuppressWarnings("deprecation")
	public Etudiant(int id, String nom, String prenom, int year, int month, int day)
	{
		this.id_etudiant = id;
		this.nom_etudiant = nom;
		this.prenom_etudiant = prenom;
		this.date_naissance = new Date(year, month, day);
	}
	
	public Etudiant()
	{
		
	}

	public List<Integer> getNotes() {
		return  dao.getNotes();
	}
	
	public double calculMoyenne()
	{
		return dao.getNotes().stream().mapToInt(p->p.intValue()).average().orElse(0);	
	}
	
	public void throwException() throws Exception {
		throw new Exception();
	}	
	
	public Double calculer_Moyenne_Etudiant()
	{
		List<Double> listValeurs = this.list_note.stream().map(p -> p.getValeur()).collect(Collectors.toList());		
		return listValeurs.stream().mapToInt(p->p.intValue()).average().orElse(0);
	}
	
	// setters et getters 

	public int getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public String getNom_etudiant() {
		return nom_etudiant;
	}

	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}

	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}

	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public List<Note> getList_note() {
		return list_note;
	}

	public void setList_note(List<Note> list_note) {
		this.list_note = list_note;
	}
}
