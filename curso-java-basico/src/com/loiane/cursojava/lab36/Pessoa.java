package com.loiane.cursojava.lab36;

public abstract class Pessoa {
	
	String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa nome=" + nome + "";
	}
	
	
	
}
