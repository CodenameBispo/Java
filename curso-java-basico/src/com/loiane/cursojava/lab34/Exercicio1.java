package com.loiane.cursojava.lab34;

public class Exercicio1 {
	
	static void imprimirValor() {
		System.out.println(Contador.retornar());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();

	}

}
