package org.mino.model;

import java.util.List;

public class Matiere {
	private int idMatiere;
	private String refMatiere;
	
	public Matiere()
	{}
	
	public Matiere(int id, String ref)
	{
		this.idMatiere = id;
		this.refMatiere = ref;
	}
	
	public int getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}
	public String getRefMatiere() {
		return refMatiere;
	}
	public void setRefMatiere(String refMatiere) {
		this.refMatiere = refMatiere;
	}
	

}
