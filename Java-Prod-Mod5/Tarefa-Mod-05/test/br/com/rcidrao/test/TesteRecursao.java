/**
 * 
 */
package br.com.rcidrao.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.rcidrao.Recursao;

/**
 * @author R�mulo
 *
 */
//Classe teste do m�todo fatorial da Classe Recurs�o
public class TesteRecursao {
	
	@Test
	public void testarRecursao() {
		
		int valueA = 4;
		Recursao recursao = new Recursao();
		int fatTest = recursao.fatorialTeste(valueA);
		
		assertEquals(24, fatTest);
	}
	
	

}
