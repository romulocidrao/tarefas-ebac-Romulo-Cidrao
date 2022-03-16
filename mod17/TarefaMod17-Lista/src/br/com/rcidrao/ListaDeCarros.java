package br.com.rcidrao;

import java.util.ArrayList;
import java.util.List;

public abstract class ListaDeCarros {

    public static void main(String args[]) {

        List<ICarros> carros = new ArrayList<>();
        carros.add(new Chevrolet());
        carros.add(new Fiat());
        carros.add(new Ford());
        carros.add(new Volkswagen());
        imprimirCarros(carros);

    }

    public static void imprimirCarros(List<? extends ICarros> lista) {
        for (ICarros carros : lista) {
            System.out.println(carros);

        }
    }
}
