package br.com.rcidrao;

public class Aluno {
	
	private int matricula;
	
	private String nome;
	
	private int nascimento;
	
	private int CPF;
	
	private String enderecoAluno;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

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

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}
	
	public int cadastrarMatricula(String matricula) {
		return 2022;
			
	}
	
	public void cadastrarNome(String nome) {
		setNome(nome);
		
	}
	
	public String retornarNome() {
		return "Rômulo Cidrão";
		
	}
	
	public int cadastrarNascimento(String nascimento) {
		return 1990;
		
		
	}
	
	public int cadastrarCPF(String CPF) {
		return 05236034;
	}
	
	/**
	 * Atualização - Endereço.
	 * 
	 * @deprecated
	 * 
	 * @return
	 * 
	 * @see public String cadastrarEnderecoAluno(String enderecoAluno)
	 */
	public void cadastrarEndereco(String endereco) {
		setNome(endereco);
		
	}
	
	public void cadastrarEnderecoAluno(String enderecoAluno) {
		setEnderecoAluno(enderecoAluno);
		
	}
	
	public String retornarEnderecoAluno() {
		return "Rua 0, número 100";
		
	}
	
		
	}

