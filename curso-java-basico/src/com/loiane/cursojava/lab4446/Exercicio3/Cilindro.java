package com.loiane.cursojava.lab4446.Exercicio3;

public class Cilindro extends Figura3D{

	private double raio;
	private double altura;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcularVolume() {
		
		return Math.PI*Math.pow(raio, 2)*altura;
	}
	
	public double calcularArea() {
		
		double areaBase = Math.PI*Math.pow(raio, 2);
		double areaLado = 2*Math.PI*raio;
		return 2*areaBase + areaLado;
	}
}
