package com.loiane.cursojava.lab3643.exercicio3;

public class Urso extends Mamifero{

	private String alimentoFavorito;

	public Urso() {
		super();
		super.setCor("Castanho");
		this.alimentoFavorito = "Mel";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nalimentoFavorito: ");
		builder.append(alimentoFavorito);
		return builder.toString();
	}
	
	
	
	
	
	
}
