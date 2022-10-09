/**
 * 
 */
package br.com.rcidrao.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.rcidrao.Calculadora;

/**
 * @author Rômulo
 *
 */
//Classe teste dos métodos da classe Calculadora
public class TesteCalculadora {
	
	public class CalculadoraTest {
		
	    @Test
	    public void testarSoma() {
	        Calculadora calc = new Calculadora();
	        assertEquals(2, calc.somar(1, 1));
	        assertEquals(1, calc.somar(1, 0));
	        assertEquals(0, calc.somar(1, -1));
	    }

	    @Test
	    public void testarSubtracao() {
	        Calculadora calc = new Calculadora();
	        assertEquals(0, calc.subtrair(1, 1));
	        assertEquals(2, calc.subtrair(1,-1));
	    }

	    @Test
	    public void testarDivisao() {
	        Calculadora calc = new Calculadora();
	        assertEquals(1, calc.dividir(3,2));
	        assertEquals(1, calc.dividir(3, 3));
	    }

	    @Test
	    public void testarMultiplicacao() {
	        Calculadora calc = new Calculadora();
	        assertEquals(6, calc.multiplicar(3, 2));
	        assertEquals(9, calc.multiplicar(3, 3));
	    }

	    @Test
	    public void testarResto() {
	        Calculadora calc = new Calculadora();
	        assertEquals(1, calc.resto(3, 2));
	        assertEquals(0, calc.resto(3, 3));
	    }

}
	
}
