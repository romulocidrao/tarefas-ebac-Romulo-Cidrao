/**
 * 
 */
package br.com.rcidrao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rcidrao.domain.Cliente;


/**
 * @author Rômulo
 *
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}