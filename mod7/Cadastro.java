package br.com.rcidrao;

public class Cadastro {

	public static void main(String[] args) {
		System.out.println("Olá, Professor.");
		System.out.println("Este é o sistema de cadastro dos novos alunos e professores.");
		Aluno aluno = new Aluno();
		aluno.cadastrarMatricula("");
		System.out.println(aluno.cadastrarMatricula(""));
		aluno.cadastrarNome("");
		System.out.println(aluno.retornarNome());
		aluno.cadastrarNascimento("");
		System.out.println(aluno.cadastrarNascimento(""));
		aluno.cadastrarCPF("");
		System.out.println(aluno.cadastrarCPF(""));
		aluno.cadastrarEnderecoAluno("");
		System.out.println(aluno.retornarEnderecoAluno());
		System.out.println("A seguir, os dados do Professor.");
		Professor professor = new Professor ();
		professor.cadastrarNome("");
		System.out.println(professor.retornarNome());
		professor.cadastrarNascimento("");
		System.out.println(professor.cadastrarNascimento(""));
		professor.cadastrarCPF("");
		System.out.println(professor.cadastrarCPF(""));
		professor.cadastrarEndereco("");
		System.out.println(professor.retornarEndereco());
		
	}

}
