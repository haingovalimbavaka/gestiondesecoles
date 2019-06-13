package org.mino.dao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.mino.model.Ecole;
import org.mino.model.Etudiant;

public class EtudiantDAO {
	
	private final List<Integer> listNotes = Arrays.asList(10, 20, 30);
	private final List<Etudiant> listEtudiant;
	
	public EtudiantDAO()
	{
		Etudiant etudiant1 = new Etudiant(1, "Etudiant_1", "", 1988, 12, 4);
		Etudiant etudiant2 = new Etudiant(2, "Etudiant_2", "", 1987, 6, 14);
		Etudiant etudiant3 = new Etudiant(3, "Etudiant_3", "", 1984, 9, 30);
		Etudiant etudiant4 = new Etudiant(3, "Etudiant_4", "", 1989, 11, 27);
		listEtudiant = new ArrayList<>();
		listEtudiant.add(etudiant1);
		listEtudiant.add(etudiant2);
		listEtudiant.add(etudiant3);
		listEtudiant.add(etudiant4);
	}

	public List<Integer> getNotes() {
		return this.listNotes;
	}	
	
	public List<Etudiant> getListEtudiants() {
		return this.listEtudiant;
	}
	
}
