package br.com.rcidrao;

import java.util.*;

public class Parte2AtividadeModulo12 {

    public static void main(String args[]) {

        System.out.println("Nomes e Gêneros separados por , ");
        Scanner s = new Scanner(System.in);
        String resposta = s.next();
        String[] nomes = resposta.split(",");
        List <String> pessoas = Arrays.asList(nomes);
        List <String> generos = new LinkedList<>(pessoas);
        int aux = 0;
        int n = 0;

        System.out.println("");
        System.out.println("Nomes sem separação por gênero: ");
        System.out.println(generos);
        System.out.println("");


        System.out.println("Nomes do Gênero Masculino: ");
            List<String> generoMasculino = new ArrayList<String>();
                for (String homens : generos) {
                    if (homens.contains("-m")) {
                    generoMasculino.add(homens);
       System.out.println(homens);
          }
     }

        System.out.println("");

        System.out.println("Nomes do Gênero Feminino: ");
        List<String> generoFeminino = new ArrayList<String>();
            for (String mulheres : generos) {
                if (mulheres.contains("-f")) {
                    generoFeminino.add(mulheres);
                    System.out.println(mulheres);
            }
         }
    }
}








