package com.loiane.cursojava.aula39;

public class Aluno extends Pessoa{
	
	
	private String curso;
	private String[] notas;
	
	
	public void verificarAcesso() {
		super.getCpf();
	}
	
	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public Aluno() {
		super();
		
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getNotas() {
		return notas;
	}
	public void setNotas(String[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf(curso);
		
		this.setCpf(curso);
	}	
	
}
