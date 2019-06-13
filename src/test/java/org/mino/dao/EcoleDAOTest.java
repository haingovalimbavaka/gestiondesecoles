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
import org.mino.model.Ecole;

/**
 * @author OneLogic
 *
 */
public class EcoleDAOTest {

	private EcoleDAO ecoleDAO;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.ecoleDAO = new EcoleDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.mino.dao.EcoleDAO#getEcoles()}.
	 */
	@Test
	public void testGetEcoles() {
		List<Ecole> result = this.ecoleDAO.getListEcoles();		
		assertThat(result, IsNull.notNullValue());
		assertThat(result.size(), IsEqual.equalTo(2));
	}

}
