package br.com.rcidrao.dao;

/**
 * 
 */

import java.util.List;

import br.com.rcidrao.dao.generic.IGenericDAO;
import br.com.rcidrao.domain.Cliente;



public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}