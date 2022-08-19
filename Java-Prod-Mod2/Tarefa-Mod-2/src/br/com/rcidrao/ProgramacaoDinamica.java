package br.com.rcidrao;

public class ProgramacaoDinamica {

    private static int fat(int n) {
        if (n == 1 || n == 0) return 1;
        return n * fat(n - 1);
    }


    public static void main(String args[]) {

        System.out.println("Programacao Dinamica "+ fat(7));
    }
}
