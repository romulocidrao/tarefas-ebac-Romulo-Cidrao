package br.com.rcidrao.dao;

/**
 * 
 */

import java.util.List;

import br.com.rcidrao.dao.generic.IGenericDAO;
import br.com.rcidrao.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}