package br.com.rcidrao;

public class Cliente {

    private String tipoRequisicao;
    private boolean possuiContrato;

    public Cliente (String tipoRequisicao, boolean possuiContrato) {
        this.tipoRequisicao = tipoRequisicao;
        this.possuiContrato = possuiContrato;
    }

    public String getTipoRequisicao() {
        return tipoRequisicao;
    }

    public boolean possuiContrato() {
        return possuiContrato;
    }

}
