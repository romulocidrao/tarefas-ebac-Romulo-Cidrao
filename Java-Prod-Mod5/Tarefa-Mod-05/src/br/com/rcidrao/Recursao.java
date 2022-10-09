/**
 * 
 */
package br.com.rcidrao;

/**
 * @author R�mulo
 *
 */

//Classe Recurs�o para c�lculo de fatorial
public class Recursao {

    public static int fatorialTeste(int n) {

        if (n == 0) {

            return 1;
        }

        return n * fatorialTeste(n-1);
    }

    public static void main(String args[]) {
        int n = 7;

        System.out.println("Fatorial " + "=" + fatorialTeste(n));

    }
}