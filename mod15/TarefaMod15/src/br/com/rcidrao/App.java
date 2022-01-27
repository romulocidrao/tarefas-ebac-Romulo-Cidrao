package br.com.rcidrao;

public class App {

    public static void main(String args[]) {
        Cliente clienteUm = new Cliente("A", true);
        Fabrica fabrica = getTipoRequisicao(clienteUm);
        Carros carroUm = fabrica.criar(clienteUm.getTipoRequisicao());
        carroUm.iniciarAluguel();

    }

    private static Fabrica getTipoRequisicao(Cliente clienteUm) {
        if (clienteUm.possuiContrato()) {
            return new EmpresaContrato();

        } else {
            return new ClienteAvulso();

        }

    }

}
