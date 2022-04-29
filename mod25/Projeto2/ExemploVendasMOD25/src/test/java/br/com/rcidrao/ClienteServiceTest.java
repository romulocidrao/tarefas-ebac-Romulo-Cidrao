/**
 * 
 */
package br.com.rcidrao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rcidrao.dao.ClienteDaoMock;
import br.com.rcidrao.dao.IClienteDAO;
import br.com.rcidrao.domain.Cliente;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;
import br.com.rcidrao.services.ClienteService;
import br.com.rcidrao.services.IClienteService;

/**
 * @author R�mulo
 *
 */
public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("S�o Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
	
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
		
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Romulo");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Romulo", cliente.getNome());
		
	}

}
