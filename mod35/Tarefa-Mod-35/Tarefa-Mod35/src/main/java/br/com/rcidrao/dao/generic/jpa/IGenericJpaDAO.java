/**
 * 
 */
package br.com.rcidrao.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.rcidrao.dao.Persistente;
import br.com.rcidrao.exceptions.DAOException;
import br.com.rcidrao.exceptions.MaisDeUmRegistroException;
import br.com.rcidrao.exceptions.TableException;
import br.com.rcidrao.exceptions.TipoChaveNaoEncontradaException;


/**
 * @author R�mulo
 *
 */
public interface IGenericJpaDAO <T extends Persistente, E extends Serializable> {

	/**
     * M�todo para cadastrar novos registro no banco de dados
     *
     * @param entity a ser cadastrado
     * @return retorna o objeto salvo
     * @throws TipoChaveNaoEncontradaException
	 * @throws DAOException
     */
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * M�todo para excluir um registro do banco de dados
     *
     * @param entity a ser cadastrado
	 * @throws DAOException
     */
    public void excluir(T entity) throws DAOException;

    /**
     *M�todo para alterar um registro no bando de dados.
     *
     * @param entity a ser atualizado
     * @return retorna o objeto salvo
     * @throws TipoChaveNaoEncontradaException
	 * @throws DAOException
     */
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * M�todo para consultar um registro no banco de dados
     *
     * @param id chave �nica do dado a ser consultado
     * @return
     * @throws MaisDeUmRegistroException 
     * @throws TableException 
     */
    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    /**
     * M�todo que ir� retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     * @throws DAOException 
     */
    public Collection<T> buscarTodos() throws DAOException;
}