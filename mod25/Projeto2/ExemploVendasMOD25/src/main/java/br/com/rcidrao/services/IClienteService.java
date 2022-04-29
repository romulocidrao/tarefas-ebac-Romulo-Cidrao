/**
 * 
 */
package br.com.rcidrao.services;

import br.com.rcidrao.domain.Cliente;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Rômulo
 *
 */
public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
