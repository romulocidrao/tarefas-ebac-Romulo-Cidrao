/**
 * 
 */
package br.com.rcidrao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rcidrao.dao.ClienteDAO;
import br.com.rcidrao.dao.ClienteDaoMock;
import br.com.rcidrao.dao.IClienteDAO;
import br.com.rcidrao.domain.Cliente;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author R�mulo
 *
 */
public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
		
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("S�o Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
		
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Romulo");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Romulo", cliente.getNome());;
		
	}

}
