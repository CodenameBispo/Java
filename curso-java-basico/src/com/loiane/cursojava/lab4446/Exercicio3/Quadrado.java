package com.loiane.cursojava.lab4446.Exercicio3;

public class Quadrado extends Figura2D{
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		
		return lado*lado;
	}
}
