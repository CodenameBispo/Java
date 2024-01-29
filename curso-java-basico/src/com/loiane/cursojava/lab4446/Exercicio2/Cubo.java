package com.loiane.cursojava.lab4446.Exercicio2;

public class Cubo extends Figura3D {

	private double lado;
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		
		return Math.pow(lado, 3);
	}
	
	public double calcularArea() {
		
		return 6*lado*lado;
	}
	
	
}