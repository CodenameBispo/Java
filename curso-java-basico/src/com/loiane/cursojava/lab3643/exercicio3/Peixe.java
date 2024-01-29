package com.loiane.cursojava.lab3643.exercicio3;

public class Peixe extends Animal {

	private String caracteristicas;

	public Peixe(String caracteristicas) {
		super();
		super.setNumPatas(0);
		super.setAmbiente("Mar");
		super.setCor("Cinzento");
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public final void setNumPatas(int numPatas) {
		super.setNumPatas(0);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\ncaracteristicas: ");
		builder.append(caracteristicas);
		return builder.toString();
	}
	
	

}
