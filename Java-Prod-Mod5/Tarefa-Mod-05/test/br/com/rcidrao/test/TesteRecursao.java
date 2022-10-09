/**
 * 
 */
package br.com.rcidrao.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.rcidrao.Recursao;

/**
 * @author Rômulo
 *
 */
//Classe teste do método fatorial da Classe Recursão
public class TesteRecursao {
	
	@Test
	public void testarRecursao() {
		
		int valueA = 4;
		Recursao recursao = new Recursao();
		int fatTest = recursao.fatorialTeste(valueA);
		
		assertEquals(24, fatTest);
	}
	
	

}
