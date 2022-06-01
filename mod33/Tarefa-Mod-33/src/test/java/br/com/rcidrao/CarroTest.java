/**
 * 
 */
package br.com.rcidrao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.rcidrao.dao.AcessorioDao;
import br.com.rcidrao.dao.CarroDao;
import br.com.rcidrao.dao.IAcessorioDao;
import br.com.rcidrao.dao.ICarroDao;
import br.com.rcidrao.dao.IMarcaDao;
import br.com.rcidrao.dao.MarcaDao;
import br.com.rcidrao.domain.Acessorio;
import br.com.rcidrao.domain.Carro;
import br.com.rcidrao.domain.Marca;


/**
 * @author Rômulo
 *
 */
public class CarroTest {
	
	private IAcessorioDao acessorioDao;
	
	private ICarroDao carroDao;
	
	private IMarcaDao marcaDao;
	
	public CarroTest() {
		acessorioDao = new AcessorioDao();
		carroDao = new CarroDao();
		marcaDao = new MarcaDao();
	}

	@Test
	public void cadastrar() {
		Acessorio acessorio = criarAcessorio("A01");
		Marca marca = criarMarca("A02");
		
		Carro carro = new Carro();
		carro.setCodigo("2022");
		carro.setMarca(marca);
		carro.setModelo("Corolla");
		carro.setAcessorios(acessorio);
		carro = carroDao.cadastrar(carro);
		
		assertNotNull(carro);
		assertNotNull(carro.getId());
		
	}
	
	private Acessorio criarAcessorio(String codigo) {
		Acessorio acessorios = new Acessorio();
		acessorios.setCodigo("A01");
		acessorios.setTipo("Som");
		return acessorioDao.cadastrar(acessorios);

	}


	private Marca criarMarca(String codigo) {
		Marca marca = new Marca();
		marca.setCodigo("A02");
		marca.setNome("Toyota");
		return marcaDao.cadastrar(marca);
	}

}
