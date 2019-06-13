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
		Ecole ecole3 = new Ecole(3, "Ecole_32");
		listEcole = new ArrayList<>();
		listEcole.add(ecole1);
		listEcole.add(ecole2);
		listEcole.add(ecole3);
	}	
	
	public List<Ecole> getListEcoles() {
		return this.listEcole;
	}
}
