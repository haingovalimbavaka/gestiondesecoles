/**
 * 
 */
package org.mino;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import org.hamcrest.core.IsCollectionContaining;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mino.dao.EtudiantDAO;
import org.mino.model.Etudiant;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * @author OneLogic
 *
 */
public class EtudiantTest {
	
	private Etudiant etudiant;
	private EtudiantDAO dao;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dao = Mockito.mock(EtudiantDAO.class);
		etudiant = new Etudiant(dao);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.mino.model.Etudiant#getNotes()}.
	 */
	@Test
	public void testGetNotes() {	
		Mockito.when(dao.getNotes()).thenReturn(new ArrayList<>());
		List<Integer> result = etudiant.getNotes();
		assertThat(result, IsNull.notNullValue());
		assertThat(result.size(), IsEqual.equalTo(0));
	}
	
	@Test
	public void testGetNotes_exist() {	
		Mockito.when(dao.getNotes()).thenReturn(Arrays.asList(4,8,9,10));
		List<Integer> result = etudiant.getNotes();
		assertThat(result, IsNull.notNullValue());
		assertThat(result.size(), IsEqual.equalTo(4));
	}

	/**
	 * Test method for {@link org.mino.model.Etudiant#calculMoyenne()}.
	 */
	@Test
	public void testCalculMoyenne() {
		Mockito.when(dao.getNotes()).thenReturn(new ArrayList<>());
		Double result = etudiant.calculMoyenne();
		assertThat(result, IsNull.notNullValue());
		assertThat(result, IsEqual.equalTo(0D));
	}
	
	@Test
	public void testCalculMoyenne_exist() {	
		Mockito.when(dao.getNotes()).thenReturn(Arrays.asList(4,8,9,10));
		Double result = etudiant.calculMoyenne();
		assertThat(result, IsNull.notNullValue());
		assertThat(result, IsEqual.equalTo(7.75));
	}

	/**
	 * Test method for {@link org.mino.model.Etudiant#throwException()}.
	 * @throws Exception 
	 */
	@Test(expected=Exception.class)
	public void testThrowException() throws Exception {
		etudiant.throwException();
	}

}
