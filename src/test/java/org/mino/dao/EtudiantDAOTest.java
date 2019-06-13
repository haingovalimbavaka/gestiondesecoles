/**
 * 
 */
package org.mino.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mino.dao.EtudiantDAO;
import org.mino.model.Ecole;
import org.mino.model.Etudiant;

/**
 * @author OneLogic
 *
 */
public class EtudiantDAOTest {
	
	private EtudiantDAO etudiantDAO;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.etudiantDAO = new EtudiantDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test method for {@link org.mino.dao.EtudiantDAO#getNotes()}.
	 */
	
	@Test
	public void testGetNotes() {		
		List<Integer> result = this.etudiantDAO.getNotes();		
		assertThat(result, IsNull.notNullValue());
		assertThat(result.size(), IsEqual.equalTo(3));
		//assertEquals(result.size(), 3);
	}
	
	@Test
	public void testGetListEtudiants() {
		List<Etudiant> result = this.etudiantDAO.getListEtudiants();		
		assertThat(result, IsNull.notNullValue());
		assertThat(result.size(), IsEqual.equalTo(4));
	}
}
