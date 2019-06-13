package org.mino.dao;

import java.util.ArrayList;
import java.util.List;

import org.mino.model.Matiere;

public class MatiereDAO {
	private final List<Matiere> listMatiere;
	public MatiereDAO()
	{
		Matiere mat1 = new Matiere(1, "Math");
		Matiere mat2 = new Matiere(2, "Anglais");
		
		listMatiere = new ArrayList<>();
		listMatiere.add(mat1);
		listMatiere.add(mat2);
	}
	
	public List<Matiere> getListMatieres() {
		return this.listMatiere;
	}
}
