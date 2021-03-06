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

import br.com.rcidrao.dao.ClienteDAO;
import br.com.rcidrao.dao.IClienteDAO;
import br.com.rcidrao.domain.Cliente;

/**
 * @author R?mulo
 *
 */
public class ClienteTest {
	
	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Romulo Cidrao");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}
	
	@Test
	public void buscarTodosTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Romulo Cidrao");
		Integer cont = dao.cadastrar(cliente);
		assertTrue(cont == 1);
		
		Cliente clientes = new Cliente();
		clientes.setCodigo("02");
		clientes.setNome("Rafael Cardoso");
		Integer cont2 = dao.cadastrar(clientes);
		assertTrue(cont2 == 1);
		
		List<Cliente> list = dao.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());
		
		int contDel = 0;
		for (Cliente cli : list) {
			dao.excluir(cli);
			contDel++;
		}
		assertEquals(list.size(), contDel);
		
		list = dao.buscarTodos();
		assertEquals(list.size(), 0);
		
	}
	
	@Test
	public void atualizarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Romulo Cidrao");
		Integer cont = dao.cadastrar(cliente);
		assertTrue(cont == 1);
		
		
		Cliente clienteBD = dao.consultar("01");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		clienteBD.setCodigo("20");
		clienteBD.setNome("Ana Clara");
		Integer contAtual = dao.atualizar(clienteBD);
		assertTrue(contAtual == 1);
		
		Cliente clienteBD1 = dao.consultar("01");
		assertNull(clienteBD1);
		
		Cliente clienteBD2 = dao.consultar("20");
		assertNotNull(clienteBD2);
		assertEquals(clienteBD.getId(), clienteBD2.getId());
		assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
		assertEquals(clienteBD.getNome(), clienteBD2.getNome());
		
		List<Cliente> list = dao.buscarTodos();
		for (Cliente cli : list) {
			dao.excluir(cli);
			
		}
	}
		
		
	

}
