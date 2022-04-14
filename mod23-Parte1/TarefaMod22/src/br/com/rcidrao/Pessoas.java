package br.com.rcidrao;

import org.testng.Assert;
import org.testng.AssertJUnit;

import java.util.*;
import java.util.stream.Collectors;

public class Pessoas {

    public static void main(String args[]) {

        System.out.println("Nomes e Gêneros separados por , ");
        Scanner s = new Scanner(System.in);
        String resposta = s.next();
        String[] nomes = resposta.split(",");
        List<String> pessoas = Arrays.asList(nomes);
        List<String> generos = new LinkedList<>(pessoas);
        int aux = 0;
        int n = 0;

        System.out.println("");
        System.out.println("Nomes sem separação por gênero: ");
        System.out.println(generos);
        System.out.println("");

        System.out.println("Nomes do Gênero Feminino: ");
        List<String> result = generos.stream()
                .filter(name -> name.endsWith("-f"))
                .collect(Collectors.toList());

        result.forEach(element -> System.out.println(element));

        String[] linhas = result.toString().split(System.lineSeparator());
        String atual = linhas[linhas.length-1];

        Assert.assertEquals(atual, atual);
    }


}

