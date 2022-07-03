/**
 * 
 */
package br.com.rcidrao.dao.jpa;

import br.com.rcidrao.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.rcidrao.domain.jpa.ClienteJpa;

/**
 * @author Rômulo
 *
 */

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}