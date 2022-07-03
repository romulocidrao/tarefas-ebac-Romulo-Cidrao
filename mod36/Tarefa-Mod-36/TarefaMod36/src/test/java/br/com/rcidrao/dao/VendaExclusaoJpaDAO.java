/**
 * 
 */
package br.com.rcidrao.dao;

import br.com.rcidrao.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rcidrao.dao.jpa.IVendaJpaDAO;
import br.com.rcidrao.domain.jpa.VendaJpa;
import br.com.rcidrao.exception.DAOException;
import br.com.rcidrao.exception.TipoChaveNaoEncontradaException;

/**
 * @author Rômulo
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}