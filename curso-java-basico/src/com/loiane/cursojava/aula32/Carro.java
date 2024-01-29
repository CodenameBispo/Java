package com.loiane.cursojava.aula32;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumo;
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel,
			double consumo) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumo = consumo;
	}

	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel*consumo + " km");
	}
	
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado");
		return  capCombustivel*consumo;
	}

	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumo;
		
		return qtdCombustivel;
	}
	
}
