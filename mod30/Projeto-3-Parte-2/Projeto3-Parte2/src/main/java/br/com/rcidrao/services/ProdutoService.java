/**
 * 
 */
package br.com.rcidrao.services;

import br.com.rcidrao.dao.IProdutoDAO;
import br.com.rcidrao.domain.Produto;
import br.com.rcidrao.services.generic.GenericService;

/**
 * @author Rômulo
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}