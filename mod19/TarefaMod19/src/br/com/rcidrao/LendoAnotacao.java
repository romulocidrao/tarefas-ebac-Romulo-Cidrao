package br.com.rcidrao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class LendoAnotacao {

    public static void main(String args[]) {
        executeLeituraAnotacao();

    }
        private static void executeLeituraAnotacao () {
        System.out.println("Lendo Anotação");
        UsandoAnotacao anot = new UsandoAnotacao();
        Annotation[] annotations = anot.getClass().getAnnotations();
        for (Annotation an : annotations) {
            System.out.println("Tipo de Anotação: " + an.annotationType());
        }

        for (Field field : anot.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Tabela.class)) {
                Tabela tab = field.getAnnotation(Tabela.class);
                System.out.println("Nome da anotação: " + tab.toString());
                System.out.println("Valor da anotação: " + tab.value());
            }

        }
    }
}
