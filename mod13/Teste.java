package br.com.rcidrao;

public class Teste {
	
	public static void main(String args[]) {
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Rômulo");
		pessoaFisica.setCPF("11122233323");
		pessoaFisica.setEndereco("Rua Teste, nº 0 - Fortaleza-CE");
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("EBAC SA - Cursos");
		pessoaJuridica.setCNPJ("9000025/0001-22");
		pessoaJuridica.setEndereco("Rua São Paulo, nº 1 - São Paulo-SP");
			
		
		System.out.println("Nome: " + pessoaFisica.getNome() + " / CPF: " + pessoaFisica.getCPF() + " / Endereço: " + pessoaFisica.getEndereco());
		System.out.println("");
		System.out.println("Nome: " + pessoaJuridica.getNome() + " / CNPJ: " + pessoaJuridica.getCNPJ() + " / Endereço: " + pessoaJuridica.getEndereco());
	}
	
	
		
		
	
	
	

}
