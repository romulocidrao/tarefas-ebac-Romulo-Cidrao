/**
 * 
 */
package br.com.rcidrao.dao;

import br.com.rcidrao.dao.generic.jpa.GenericJpaDAO;
import br.com.rcidrao.dao.jpa.IVendaJpaDAO;
import br.com.rcidrao.domain.jpa.VendaJpa;
import br.com.rcidrao.exceptions.DAOException;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Rômulo
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

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