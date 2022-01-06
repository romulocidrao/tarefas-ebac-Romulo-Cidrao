package br.com.rcidrao;

public class MédiaSemestral {

	public static void main(String[] args) {
		avaliacaoNotas ();
		
	}
	
	public static void avaliacaoNotas() {
		System.out.println("**** Média Final do Semestre ****");
		int nota1 = 8;
		int nota2 = 6;
		int nota3 = 8;
		int nota4 = 10;
		double notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Média Final:" + notaFinal);
		System.out.println("**** Aluno Aprovado ****");
		
	}
	
	
}
