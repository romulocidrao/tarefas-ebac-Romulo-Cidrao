package br.com.rcidrao;

public class EmpresaContrato extends Fabrica{

    Carros reservaCarro(String tipoRequisicao) {
        switch (tipoRequisicao) {
            case "A":
                return new Golf(460, "cheio", "amarela");
            case "B":
                return new A3(220, "cheio", "cinza");

            default:
                System.out.println("O carro solicitado não está disponível!");
                return null;


        }


    }

}
