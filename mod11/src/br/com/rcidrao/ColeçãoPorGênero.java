package br.com.rcidrao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColeçãoPorGênero<result> {


    public static void main(String args[]) {
        listaVendedores();
        listaVendedoresGêneroMasculino();
        listaVendedorasGêneroFeminino();
    }

    private static void listaVendedores() {

        System.out.println("****** Lista de Vendedores da Loja ******");
        List<Vendedor> vendedor = new ArrayList<>();
        Stream<Vendedor> stream = vendedor.stream();
        Vendedor a = new Vendedor("Antônio José", "masculino");
        Vendedor b = new Vendedor("Edna Maria", "feminino");
        Vendedor c = new Vendedor("Talita Sousa", "feminino");
        Vendedor d = new Vendedor("Júlio Aquino", "masculino");
        Vendedor e = new Vendedor("Hugo Guedes", "masculino");
        Vendedor f = new Vendedor("Jéssica Holanda", "feminino");
        vendedor.add(a);
        vendedor.add(b);
        vendedor.add(c);
        vendedor.add(d);
        vendedor.add(e);
        vendedor.add(f);
        System.out.println(vendedor);
        System.out.println("");

    }

        private static void listaVendedoresGêneroMasculino() {
            System.out.println("****** Vendedores - Sexo Masculino ******");
            List<Vendedor> vendedor = new ArrayList<>();
            Vendedor a = new Vendedor("Antônio José", "masculino");
            Vendedor b = new Vendedor("Edna Maria", "feminino");
            Vendedor c = new Vendedor("Talita Sousa", "feminino");
            Vendedor d = new Vendedor("Júlio Aquino", "masculino");
            Vendedor e = new Vendedor("Hugo Guedes", "masculino");
            Vendedor f = new Vendedor("Jéssica Holanda", "feminino");
            vendedor.add(a);
            vendedor.add(b);
            vendedor.add(c);
            vendedor.add(d);
            vendedor.add(e);
            vendedor.add(f);

            List<Vendedor> listVendedor = vendedor.stream()
                .filter(p -> p.getSexo().equals("masculino"))
                .collect(Collectors.toList());
            System.out.println(listVendedor);
            System.out.println("");

        }

    private static void listaVendedorasGêneroFeminino() {
        System.out.println("****** Vendedoras - Sexo Feminino ******");
        List<Vendedor> vendedor = new ArrayList<>();
        Vendedor a = new Vendedor("Antônio José", "masculino");
        Vendedor b = new Vendedor("Edna Maria", "feminino");
        Vendedor c = new Vendedor("Talita Sousa", "feminino");
        Vendedor d = new Vendedor("Júlio Aquino", "masculino");
        Vendedor e = new Vendedor("Hugo Guedes", "masculino");
        Vendedor f = new Vendedor("Jéssica Holanda", "feminino");
        vendedor.add(a);
        vendedor.add(b);
        vendedor.add(c);
        vendedor.add(d);
        vendedor.add(e);
        vendedor.add(f);

        List<Vendedor> listVendedor = vendedor.stream()
                .filter(p -> p.getSexo().equals("feminino"))
                .collect(Collectors.toList());
        System.out.println(listVendedor);
        System.out.println("");

        }
    }