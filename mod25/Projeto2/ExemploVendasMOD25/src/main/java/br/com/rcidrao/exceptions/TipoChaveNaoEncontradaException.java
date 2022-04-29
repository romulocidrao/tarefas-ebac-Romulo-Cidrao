/**
 * 
 */
package br.com.rcidrao.exceptions;

/**
 * @author Rômulo
 *
 */
public class TipoChaveNaoEncontradaException extends Exception {
	
	private static final long serialVersionUID = -2321328440476182846L;

	public TipoChaveNaoEncontradaException(String msg) {
		this(msg, null);
		
	}
	
	public TipoChaveNaoEncontradaException(String msg, Throwable e) {
		super(msg, e);
		
	}

}
