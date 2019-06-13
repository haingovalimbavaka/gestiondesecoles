/**
 * 
 */
package org.mino;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mino.dao.EtudiantDAO;
import org.mino.model.Classe;
import org.mino.model.Ecole;
import org.mino.model.Etudiant;
import org.mockito.Mockito;

/**
 * @author OneLogic
 *
 */
public class EcoleTest {
	
	private Ecole ecole;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//ecole = new Ecole();
		ecole = Mockito.mock(Ecole.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	

	/**
	 * Test method for {@link org.mino.model.Ecole#SetListClasse(java.util.List)}.
	 */
	@Test
	public void testSetListClasse() {		
		ecole.setListClasse(null);
		List<Classe> result= ecole.getListClasse();
		assertThat(result, IsNull.nullValue());
	}
	
	@Test
	public void testSetListClasse_non_null() {		
		ecole.setListClasse(new ArrayList<>());
		List<Classe> result= ecole.getListClasse();
		assertThat(result, IsNull.notNullValue());
	}
	
	@Test
	public void testCalculerMoyenneEcole() {	
		/*Mockito.when(ecole.getListClasse()).thenReturn(Arrays.asList(4,8,9,10));
		Double result = etudiant.calculMoyenne();
		assertThat(result, IsNull.notNullValue());
		assertThat(result, IsEqual.equalTo(7.75));*/
	}

}
