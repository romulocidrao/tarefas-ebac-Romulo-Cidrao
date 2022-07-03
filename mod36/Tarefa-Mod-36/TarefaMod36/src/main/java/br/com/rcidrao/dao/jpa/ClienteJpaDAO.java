/**
 * 
 */
package br.com.rcidrao.dao.jpa;

import br.com.rcidrao.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rcidrao.domain.jpa.ClienteJpa;

/**
 * @author Rômulo
 *
 */

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}