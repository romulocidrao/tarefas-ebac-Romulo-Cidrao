package br.com.rcidrao;

public class Teste {
	
	public static void main(String args[]) {
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("R�mulo");
		pessoaFisica.setCPF("11122233323");
		pessoaFisica.setEndereco("Rua Teste, n� 0 - Fortaleza-CE");
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("EBAC SA - Cursos");
		pessoaJuridica.setCNPJ("9000025/0001-22");
		pessoaJuridica.setEndereco("Rua S�o Paulo, n� 1 - S�o Paulo-SP");
			
		
		System.out.println("Nome: " + pessoaFisica.getNome() + " / CPF: " + pessoaFisica.getCPF() + " / Endere�o: " + pessoaFisica.getEndereco());
		System.out.println("");
		System.out.println("Nome: " + pessoaJuridica.getNome() + " / CNPJ: " + pessoaJuridica.getCNPJ() + " / Endere�o: " + pessoaJuridica.getEndereco());
	}
	
	
		
		
	
	
	

}
