package br.com.rcidrao;

import java.util.Arrays;
import java.util.Scanner;

public class Parte1AtividadeModulo12 {

        public static void main(String args[]) {

        System.out.println("Nomes separados por , ");
        Scanner s = new Scanner(System.in);

        String resposta = s.next();
        String[] nomes = resposta.split(",");
        char aux = 0;
        char n = 0;

        System.out.println("");
        System.out.println("Nomes sem ordenação: ");
        for(n = 0; n <nomes.length; n++) {
        System.out.println(nomes[n]);

        }
        System.out.println("");
        System.out.println("Nomes com ordenação");
        for (n=0; n<nomes.length; n++) {
        Arrays.sort(nomes);
        System.out.println(nomes[n]);
        }

    }
}

