/**
 * 
 */
package br.com.rcidrao;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author R�mulo
 *
 */
public class Backtracking {

	    public static void findPowerSet(int[] S, Deque<Integer> set, int n)
	    {

	        if (n == 0)
	        {
	            System.out.println(set);
	            return;
	        }
	 

	        set.addLast(S[n - 1]);
	        findPowerSet(S, set, n - 1);
	 
	        set.removeLast();
	        findPowerSet(S, set, n - 1);
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] S = { 1, 2, 3 };
	 
	        Deque<Integer> set = new ArrayDeque<>();
	        findPowerSet(S, set, S.length);
	    }
	}

	