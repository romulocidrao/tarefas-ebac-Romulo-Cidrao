package br.com.rcidrao;

public abstract class Carros {

    private int potencia;
    private String combustível;
    private String cor;

    public Carros(int potencia, String combustível, String cor) {
        this.potencia = potencia;
        this.combustível = combustível;
        this.cor = cor;
    }

    public void iniciarAluguel() {
        System.out.println(getClass().getSimpleName());
        System.out.println("O tanque está: " + combustível + "! O carro está pronto! Aproveite a potência de: " + potencia + "cv");
    }

    public void limpeza() {
        System.out.println("O carro está limpo e sua cor " + cor.toLowerCase() + " está ótima!");
    }

    public void checkupMecanico() {
        System.out.println("O carro foi revisado. Seu veículo está pronto para uso!");

    }

    public void combustívelCarro() {
        System.out.println("O tanque do carro está: " + combustível.toLowerCase() + "!");

    }
}
