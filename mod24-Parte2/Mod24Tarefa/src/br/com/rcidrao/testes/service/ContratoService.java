package br.com.rcidrao.testes.service;

import br.com.rcidrao.testes.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca realizada com sucesso!";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Exclusão realizada com sucesso!";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualização realizada!";
    }
}
