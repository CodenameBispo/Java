package com.loiane.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		
//		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		aluno.setEndereco("Rua 1, num1");
		professor.setEndereco("Rua 2, num 2");
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}

}