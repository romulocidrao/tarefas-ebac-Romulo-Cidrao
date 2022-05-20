/**
 * 
 */
package br.com.rcidrao.services;

import br.com.rcidrao.domain.Cliente;
import br.com.rcidrao.exceptions.DAOException;
import br.com.rcidrao.services.generic.IGenericService;

/**
 * @author Rômulo
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}