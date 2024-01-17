package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			
			System.out.println("Maior de 18 anos");
			
		} else {
			
			System.out.println("Menor de 18 anos");
			
		}
		
		//barato <= 10 , 10 < valor <15 - pedir desconto , 15<= valor < 17 pesquisar mais , >= 17
		
		System.out.println("Informe o valor do produto");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			
			System.out.println("Está barato, pode comprar");
			
		} else if (valor > 10 && valor <15) {
			
			System.out.println("Peça um desconto");
			
		} else if (valor >= 15 && valor <17) {
			
			System.out.println("Pesquise um pouco mais");
			
		} else {
			
			System.out.println("Muito caro");
		}
	}
}
