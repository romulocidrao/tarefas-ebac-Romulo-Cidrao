package br.com.rcidrao;

import java.util.Scanner;

public class AvaliaçãoNotas {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Notas obtidas pelo aluno durante o bimestre: ");
		double num = (10);
		double num2 = (4);
		double num3 = (8);
		double num4 = (7);
		System.out.println(num + ", " + num2 + ", " + num3 + " e " + num4 + ".");
		
		double result = (num + num2 + num3 + num4)/4;
		System.out.println("Média do Semestre: " + result);
		
		if (result >= 7 ) {
			System.out.println("Aluno aprovado!");
				
		} else if (result >=5 && result <=7) {
			System.out.println("Aluno em recuperação!");
					
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		
		}
		
}


