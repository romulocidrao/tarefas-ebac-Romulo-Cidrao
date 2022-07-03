/**
 * 
 */
package br.com.rcidrao.dao.jpa;

import br.com.rcidrao.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rcidrao.domain.jpa.ProdutoJpa;

/**
 * @author R�mulo
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}