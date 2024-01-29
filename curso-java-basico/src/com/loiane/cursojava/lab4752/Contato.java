package com.loiane.cursojava.lab4752;

public class Contato {
	
	private String nome;
	private String telefone;
	private int identificador;
	
	private static int contador = 1;
	
	public Contato() {
		super();
		identificador = contador++;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdentificador() {
		return identificador;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato ");
		builder.append(nome);
		builder.append("\nTelefone: ");
		builder.append(telefone);
		builder.append("\nIdentificador: ");
		builder.append(identificador);
		builder.append("");
		return builder.toString();
	}
}
