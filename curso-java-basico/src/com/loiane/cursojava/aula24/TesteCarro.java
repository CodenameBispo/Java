package com.loiane.cursojava.aula24;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumo = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro();
		van.marca = "Volkswagen";
		van.modelo = "Fusca";
		van.numPassageiros = 4;
		van.capCombustivel = 30;
		van.consumo = 0.15;
	}
}
