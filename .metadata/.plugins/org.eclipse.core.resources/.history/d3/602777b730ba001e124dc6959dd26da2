package com.loiane.cursojava.aula29;

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
		
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println("Autonomia: " + autonomia + " km/l");
		System.out.println("Autonomia: " + van.obterAutonomia() + " km/l");
		
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Para andar 10 km precisamos de " + qtdCombustivel10 + " litros");
		System.out.println("Para andar 10 km precisamos de " + qtdCombustivel15 + " litros");
	}
}
