package br.com.rcidrao;

public class Atividade {

    public static void main(String args[]) {
        System.out.println("*** Valor Numérico em Variável Primitiva ***");
        long numero = 20;
        System.out.println(numero);
        System.out.println("*** Valor Numérico em Variável Wrapper (Boxing) ***");
        Long numero2 = numero;
        System.out.println(numero2);
        System.out.println("*** Valor Numérico - Casting Implícito ***");
        Float numero3 = Float.valueOf(numero);
        System.out.println(numero3);
        System.out.println("*** Valor Numérico - Casting Explícito ***");
        int numero4 = (int) numero;
        System.out.println(numero4);
    }
}
