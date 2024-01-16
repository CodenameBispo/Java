package br.com.dfcodelab7.introducao.classes;

public class Pessoa {
	
	public String nome;
	public int idade;
	public String email;

	
	public Pessoa() {
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
	}
	 
	
	
}
//dentro do arquivo apenas uma classe, mas podemos ter outras classes dentro da classe principal