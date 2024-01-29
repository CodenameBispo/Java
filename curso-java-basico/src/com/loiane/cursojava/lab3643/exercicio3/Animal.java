package com.loiane.cursojava.lab3643.exercicio3;

public class Animal {

	private String nome;
	private double comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double velocidade;

	public Animal() {
		super();
		this.numPatas = 4;
	}

	public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {
		super();
		this.numPatas = 4;
		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal: ");
		builder.append(nome);
		builder.append("\nComprimento: ");
		builder.append(comprimento);
		builder.append("\nPatas: ");
		builder.append(numPatas);
		builder.append("\nCor: ");
		builder.append(cor);
		builder.append("\nAmbiente: ");
		builder.append(ambiente);
		builder.append("\nVelocidade: ");
		builder.append(velocidade);
		return builder.toString();
	}
	
	
}
