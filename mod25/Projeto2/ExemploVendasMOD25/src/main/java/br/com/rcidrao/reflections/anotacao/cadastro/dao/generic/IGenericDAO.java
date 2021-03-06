/**
 * 
 */
package br.com.rcidrao.reflections.anotacao.cadastro.dao.generic;

import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;
import br.com.rcidrao.reflections.anotacao.cadastro.domain.Persistente;

import java.util.Collection;

/**
 * @author R?mulo
 *
 */
public interface IGenericDAO <T extends Persistente>{

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(Long valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(Long valor);

    public Collection<T> buscarTodos();


}