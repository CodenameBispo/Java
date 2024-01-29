package com.loiane.cursojava.lab4752;

public class ContatoNaoExisteException extends Exception{
	
	private String nomeContato;
	private int idContato;
	
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	
	public ContatoNaoExisteException(int idContato) {
		
		this.idContato = idContato;
	}


	@Override
	public String getMessage() {
		
		return "Contato " + nomeContato + " não existe na agenda!";
	}
}
