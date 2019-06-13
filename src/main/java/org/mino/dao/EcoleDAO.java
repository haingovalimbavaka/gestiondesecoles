package org.mino.dao;

import java.util.ArrayList;
import java.util.List;

import org.mino.model.Ecole;

public class EcoleDAO {
	private final List<Ecole> listEcole;
	
	public EcoleDAO()
	{
		// initialisation des Ecoles
		Ecole ecole1 = new Ecole(1, "Ecole_1");
		Ecole ecole2 = new Ecole(2, "Ecole_2");
		listEcole = new ArrayList<Ecole>();
		listEcole.add(ecole1);
		listEcole.add(ecole2);
	}	
	
	public List<Ecole> getListEcoles() {
		return this.listEcole;
	}
}
