/**
 * 
 */
package br.com.rcidrao.dao;

import br.com.rcidrao.domain.Cliente;
import br.com.rcidrao.reflections.anotacao.cadastro.dao.generic.GenericDAO;



public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

	public ClienteDAO() {
		super();
		
	}
		
	
	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}


	
}
