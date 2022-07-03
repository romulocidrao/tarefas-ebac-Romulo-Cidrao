/**
 * 
 */
package br.com.rcidrao.dao.jpa;

import br.com.rcidrao.dao.generic.jpa.IGenericJapDAO;
import br.com.rcidrao.domain.jpa.Persistente;

/**
 * @author Rômulo
 *
 */

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}