/**
 * 
 */
package br.com.rcidrao.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.rcidrao.dao.Persistente;
import br.com.rcidrao.dao.generic.jpa.IGenericJpaDAO;
import br.com.rcidrao.exceptions.DAOException;
import br.com.rcidrao.exceptions.MaisDeUmRegistroException;
import br.com.rcidrao.exceptions.TableException;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Rômulo
 *
 */
public abstract class GenericJpaService<T extends Persistente, E extends Serializable> 
implements IGenericJpaService<T, E> {

protected IGenericJpaDAO<T, E> dao;

public GenericJpaService(IGenericJpaDAO<T, E> dao) {
	this.dao = dao;
}


@Override
public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
	return this.dao.cadastrar(entity);
}

@Override
public void excluir(T entity) throws DAOException {
	this.dao.excluir(entity);
}

@Override
public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
	return this.dao.alterar(entity);
}

@Override
public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
	return this.dao.consultar(valor);
}

@Override
public Collection<T> buscarTodos() throws DAOException {
	return this.dao.buscarTodos();
}


}