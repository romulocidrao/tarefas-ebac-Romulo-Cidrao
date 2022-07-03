/**
 * 
 */
package br.com.rcidrao.dao.generic.jpa;

/**
 * @author Rômulo
 *
 */
import java.io.Serializable;

import br.com.rcidrao.domain.jpa.Persistente;

public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}