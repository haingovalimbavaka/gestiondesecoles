package org.mino.dao;

import java.util.ArrayList;
import java.util.List;

import org.mino.model.Classe;

public class ClasseDAO {
	private final List<Classe> listClasse;
	
	public ClasseDAO()
	{
		// initialisation des Ecoles
		Classe classe1 = new Classe(1, "CM1");
		Classe classe2 = new Classe(2, "CP");
		listClasse = new ArrayList<Classe>();
		listClasse.add(classe1);
		listClasse.add(classe2);
	}	
	
	public List<Classe> getListClasse() {
		return this.listClasse;
	}
}
