package org.mino.model;
import java.util.ArrayList;
import java.util.List;

public class Ecole {
	
	private int idEcole; 
	private String nomEcole;
	private List<Classe> listClasse;
	
	public Ecole(){}
	public Ecole(int id, String nom)
	{
		this.idEcole = id;
		this.nomEcole = nom;
		this.listClasse = new ArrayList<>();
	}
	
	public Double calculerMoyenneEcole()
	{
		Double sommeMoyenne = 0D;
		for(Classe classe : listClasse)
		{
			sommeMoyenne += classe.calculerMoyenneclasse();
		}
		return sommeMoyenne/listClasse.size();	
	}

	public List<Classe> getListClasse() {
		return listClasse;
	}

	public void setListClasse(List<Classe> listClasse) {
		this.listClasse = listClasse;
	}
	
	public int getIdEcole() {
		return idEcole;
	}
	public void setIdEcole(int idEcole) {
		this.idEcole = idEcole;
	}
	public String getNomEcole() {
		return nomEcole;
	}
	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}
}
