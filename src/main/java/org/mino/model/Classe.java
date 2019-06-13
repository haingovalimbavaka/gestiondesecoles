package org.mino.model;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	
	private int id_classe;
	private String libelle_classe;
	private Ecole ecole;
	private List<Etudiant> listEtudiant;
	
	public Classe()
	{}
	
	public Classe(int id, String lib )
	{
		this.id_classe = id;
		this.libelle_classe = lib;
		this.ecole = new Ecole();
		this.listEtudiant = new ArrayList<Etudiant>();
	}
		
	public Double calculerMoyenneclasse()
	{
		Double somme_moyenne = 0D;
		for(Etudiant etudiant : listEtudiant)
		{
			somme_moyenne += etudiant.calculer_Moyenne_Etudiant();
		}
		return somme_moyenne/listEtudiant.size();		
	}
	
	public int getId_classe() {
		return id_classe;
	}
	public void setId_classe(int id_classe) {
		this.id_classe = id_classe;
	}
	public String getLibelle_classe() {
		return libelle_classe;
	}
	public void setLibelle_classe(String libelle_classe) {
		this.libelle_classe = libelle_classe;
	}
	public List<Etudiant> getListEtudiant() {
		return listEtudiant;
	}
	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}
	public Ecole getEcole() {
		return ecole;
	}
	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}
}
