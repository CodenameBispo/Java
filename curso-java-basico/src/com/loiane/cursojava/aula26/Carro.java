package com.loiane.cursojava.aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumo;
	
	//void - tipo de retorno
	//exemplo de método: bloco de codigo que pode ser utilizado várias vezes
	//boas praticas, sempre começar com verbos
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel*consumo + " km");
	}
	
	//método com retorno
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado");
		return  capCombustivel*consumo;
	}
}
