/**
 * 
 */
package br.com.rcidrao.dao.jpa;

import br.com.rcidrao.dao.generic.jpa.IGenericJpaDAO;
import br.com.rcidrao.domain.jpa.VendaJpa;
import br.com.rcidrao.exceptions.DAOException;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author R�mulo
 *
 */
public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	/**
	 * Usando este m�todo para evitar a exception org.hibernate.LazyInitializationException
	 * Ele busca todos os dados de objetos que tenham colletion pois a mesma por default � lazy
	 * Mas voc� pode configurar a propriedade da collection como fetch = FetchType.EAGER na anota��o @OneToMany e usar o consultar gen�rico normal
	 * 
	 * OBS: N�o � uma boa pr�tica utiliar FetchType.EAGER pois ele sempre ir� trazer todos os objetos da collection
	 * mesmo sem precisar utilizar.
	 * 
	 * 
	 * @see VendaJpa produtos
	 * 
	 * @param id
	 * @return
	 */
	public VendaJpa consultarComCollection(Long id);
}