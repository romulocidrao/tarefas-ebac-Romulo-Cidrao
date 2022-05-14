/**
 * 
 */
package br.com.rcidrao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import br.com.rcidrao.dao.IProdutoDAO;
import br.com.rcidrao.dao.ProdutoDAO;
import br.com.rcidrao.domain.Produto;


/**
 * @author Rômulo
 *
 */
public class ProdutoTest {
	
	@Test
	public void cadastrarProdutoTest() throws Exception {
		IProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("11");
		produto.setNome("Margarina");
		
		Integer qtd = produtoDAO.inserir(produto);
		assertTrue(qtd == 1);
		
		
		Produto produtoBD = produtoDAO.buscar(produto.getCodigo());
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		Integer qtdDel = produtoDAO.excluir(produtoBD);
		assertNotNull(qtdDel);
	}
	
	@Test
	public void buscarTodosTest() throws Exception {
		IProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Margarina");
		Integer cont = produtoDAO.inserir(produto);
		assertTrue(cont == 1);
		
		Produto produtos = new Produto();
		produtos.setCodigo("02");
		produtos.setNome("Presunto");
		Integer cont2 = produtoDAO.inserir(produtos);
		assertTrue(cont2 == 1);
		
		List<Produto> list = produtoDAO.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());
		
		int contDel = 0;
		for (Produto pro : list) {
			produtoDAO.excluir(pro);
			contDel++;
		}
		assertEquals(list.size(), contDel);
		
		list = produtoDAO.buscarTodos();
		assertEquals(list.size(), 0);
		
	}
	
	@Test
	public void atualizarTest() throws Exception {
		IProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Margarina");
		Integer cont = produtoDAO.inserir(produto);
		assertTrue(cont == 1);
		
		
		Produto produtoBD = produtoDAO.buscar("01");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		produtoBD.setCodigo("02");
		produto.setNome("Manteiga");
		Integer contAtual = produtoDAO.atualizar(produtoBD);
		assertTrue(contAtual == 1);
		
		Produto produtoBD1 = produtoDAO.buscar("01");
		assertNull(produtoBD1);
		
		Produto produtoBD2 = produtoDAO.buscar("02");
		assertNotNull(produtoBD2);
		assertEquals(produtoBD.getId(), produtoBD2.getId());
		assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
		assertEquals(produtoBD.getNome(), produtoBD2.getNome());
		
		List<Produto> list = produtoDAO.buscarTodos();
		for (Produto pro : list) {
			produtoDAO.excluir(pro);
			
		}
	}

}
