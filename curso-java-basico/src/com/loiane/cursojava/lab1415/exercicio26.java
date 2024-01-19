package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio26 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tipo de combustível?");
		System.out.println("G - Gasolina | A - Alcool");
		String comb = scan.next();
		
		System.out.println("Quantos litros serão abaastecidos?");
		int litros = scan.nextInt();
		double preco = 0;
		
		if (comb.equalsIgnoreCase("a")) {
			
			if(litros <= 20) {
				
				preco = litros*(1.90 - 1.9*0.03) ;
				System.out.println("O preço por " + litros + " litros de Alcool é: R$ " + preco);
				
			} else {
				
				preco = litros*(1.90 - 1.9*0.05) ;
				System.out.println("O preço por " + litros + " litros de Alcool é: R$ " + preco);
			}
			
			
		} else {
			
			if(litros <= 20) {
				
				preco = litros*(2.5 - 2.5*0.04) ;
				System.out.println("O preço por " + litros + " litros de Gasolina é: R$ " + preco);
				
			} else {
				
				preco = litros*(2.5 - 2.5*0.06) ;
				System.out.println("O preço por " + litros + " litros de Gasolina é: R$ " + preco);
			}
			
	
			
		}
		
		
	}
}
