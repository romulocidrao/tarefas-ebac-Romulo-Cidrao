/**
 * 
 */
package br.com.rcidrao.services;


import br.com.rcidrao.dao.IClienteDAO;
import br.com.rcidrao.domain.Cliente;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Rômulo
 *
 */
public class ClienteService implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
		
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		return clienteDAO.cadastrar(cliente);

	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return clienteDAO.consultar(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		clienteDAO.alterar(cliente);
		
	}

}
