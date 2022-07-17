package br.com.rcidrao.service;

/**
 * 
 */

import java.util.List;

import br.com.rcidrao.domain.Produto;
import br.com.rcidrao.service.generic.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}