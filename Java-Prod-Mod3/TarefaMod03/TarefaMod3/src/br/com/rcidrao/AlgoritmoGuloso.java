/**
 * 
 */
package br.com.rcidrao;

/**
 * @author R�mulo
 *
 */
public class AlgoritmoGuloso {

	// Fun��o para encontrar o n�mero m�nimo de moedas necess�rias
    // para obter um total de `target` do conjunto `S`
    public static int findMinCoins(int[] S, int target)
    {
        // se o total for 0, nenhuma moeda � necess�ria
        if (target == 0) {
            return 0;
        }
 
        // retorna infinito se total ficar negativo
        if (target < 0) {
            return Integer.MAX_VALUE;
        }
 
        // inicializa o n�mero m�nimo de moedas necess�rias para o infinito
        int coins = Integer.MAX_VALUE;
 
        // faz para cada moeda
        for (int c: S)
        {
            // retorna para ver se o total pode ser alcan�ado incluindo a moeda atual `c`
            int result = findMinCoins(S, target - c);
 
            // atualiza o n�mero m�nimo de moedas necess�rias se escolher o atual
            // moeda resultou em uma solu��o
            if (result != Integer.MAX_VALUE) {
                coins = Integer.min(coins, result + 1);
            }
        }
 
        // retorna o n�mero m�nimo de moedas necess�rias
        return coins;
    }
 
    public static void main(String[] args)
    {
        // moedas de determinadas denomina��es
        int[] S = { 1, 2, 5 };
 
        // mudan�a total necess�ria
        int target = 18;
 
        int coins = findMinCoins(S, target);
        if (coins != Integer.MAX_VALUE)
        {
            System.out.print("N�mero de moedas necess�rias para o troco = " + coins);
        }
    }
}
