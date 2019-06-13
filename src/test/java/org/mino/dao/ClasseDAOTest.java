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
import org.mino.model.Classe;

/**
 * @author OneLogic
 *
 */
public class ClasseDAOTest {

	private ClasseDAO classDAO;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.classDAO = new ClasseDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.mino.dao.ClasseDAO#getListClasse()}.
	 */
	@Test
	public void testGetListClasse() {
		List<Classe> result = this.classDAO.getListClasse();
		assertThat(result, IsNull.notNullValue());
		assertThat(result.size(), IsEqual.equalTo(2));
	}

}
