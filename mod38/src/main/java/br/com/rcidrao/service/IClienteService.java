package br.com.rcidrao.service;

/**
 * 
 */

import java.util.List;

import br.com.rcidrao.domain.Cliente;
import br.com.rcidrao.exceptions.DAOException;
import br.com.rcidrao.service.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}