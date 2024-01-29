package com.loiane.cursojava.lab36;

public class Agenda {
	
//	private Contato[] contatos = new Contato[3];
	private String[][] contatos = new String[3][3];
	private String nomeAgenda;
	


	public String[][] getContatos() {
		return contatos;
	}
	public void setContatos(String[][] contatos) {
		this.contatos = contatos;
	}
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	
	public int mostrarContato(int valor) {
		System.out.println("Dados do contato " + contatos[valor-1][0]);
		for(int i = 1; i<3 ; i++) {
			System.out.println(contatos[valor-1][i]);	
		}
		return valor;
	}
	
	public void mostrarTodosContatos() {
		
		System.out.println("Lista de contatos: ");
		int cont =1;
		for(String[] contato : contatos) {
			
			System.out.println(cont + "- " + contato[0]);
			cont++;
		}
	}

	
}
