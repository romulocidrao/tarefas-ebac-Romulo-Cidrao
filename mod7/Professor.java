package br.com.rcidrao;

public class Professor {

	private String nome;
	
	private int nascimento;
	
	private int CPF;
	
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void cadastrarNome(String nome) {
		setNome(nome);
		
	}
	
	public String retornarNome() {
		return "Antônio José";
		
	}
	
	public int cadastrarNascimento(String nascimento) {
		return 1970;
		
		
	}
	
	public int cadastrarCPF(String CPF) {
		return 12365478;
	}
	
	public void cadastrarEndereco(String endereco) {
		setNome(endereco);
		
	}
	
	public String retornarEndereco() {
		return "Rua Francisco, número 10";
		
	}

}
