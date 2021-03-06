/**
 * 
 */
package br.com.rcidrao.dao;

import java.util.List;


import br.com.rcidrao.domain.Produto;

/**
 * @author R?mulo
 *
 */
public interface IProdutoDAO {

	public Integer inserir(Produto produto) throws Exception;

	public Produto buscar(String codigo) throws Exception;

	public Integer excluir(Produto produto) throws Exception;

	public List<Produto> buscarTodos() throws Exception;

	public Integer atualizar(Produto produto) throws Exception;
}
