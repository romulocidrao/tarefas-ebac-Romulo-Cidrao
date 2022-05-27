/**
 * 
 */
package br.com.rcidrao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rcidrao.dao.IProdutoDAO;
import br.com.rcidrao.dao.ProdutoDAO;
import br.com.rcidrao.domain.Produto;

/**
 * @author Rômulo
 *
 */
public class ProdutoTest {
	
private IProdutoDAO produtoDAO;
	
	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
		
	} 

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("15");
		produto.setProduto("Presunto de Peru");
		produto = produtoDAO.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
		
	}

}
