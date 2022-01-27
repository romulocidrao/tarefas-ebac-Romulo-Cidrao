package br.com.rcidrao;

public class ClienteAvulso extends Fabrica{

    Carros reservaCarro(String tipoRequisicao) {

        switch (tipoRequisicao) {
            case "A":
                return new Gol(110, "cheio", "preta");
            case "B":
                return new Corolla(170, "cheio", "branca");

            default:
                System.out.println("O carro solicitado não está disponível!");
                return null;


        }
    }


}
