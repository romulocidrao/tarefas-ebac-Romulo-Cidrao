/**
 * 
 */
package br.com.rcidrao.dao;

import br.com.rcidrao.dao.generic.IGenericDAO;
import br.com.rcidrao.domain.Venda;
import br.com.rcidrao.exceptions.DAOException;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author R?mulo
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}