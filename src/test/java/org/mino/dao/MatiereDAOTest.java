/**
 * 
 */
package org.mino.dao;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mino.model.Matiere;

/**
 * @author OneLogic
 *
 */
public class MatiereDAOTest {
	private MatiereDAO matiereDAO;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.matiereDAO = new MatiereDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.mino.dao.MatiereDAO#getListMatieres()}.
	 */
	@Test
	public void testGetListMatieres() {
		List<Matiere> result = this.matiereDAO.getListMatieres();		
		assertThat(result, IsNull.notNullValue());
		assertThat(result.size(), IsEqual.equalTo(2));
	}

}
