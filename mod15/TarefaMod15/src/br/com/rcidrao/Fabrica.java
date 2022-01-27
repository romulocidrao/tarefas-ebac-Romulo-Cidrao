package br.com.rcidrao;

public abstract class Fabrica {

    public Carros criar (String tipoRequisicao) {
        Carros carros = reservaCarro(tipoRequisicao);
        carros = prepararCarro(carros);
        return carros;

    }

    private Carros prepararCarro(Carros carros) {
        carros.limpeza();
        carros.checkupMecanico();
        carros.combustívelCarro();
        return carros;

    }

    abstract Carros reservaCarro(String tipoRequisicao);


}
