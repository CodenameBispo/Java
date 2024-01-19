package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio28 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual carne gostaria de comprar?");
		System.out.println("File , Alcatra ou Picanha?");
		String tipo = scan.next();
		double preco = 0;
		
		
		if(tipo.equalsIgnoreCase("file")) {
			
			System.out.println("Quantos kilos de Filé Duplo?");		
			int carne = scan.nextInt();
			
			if(carne <= 5) {
				
				preco = carne * 4.9; 
				
			} else {
				
				preco = carne * 5.8;
				
			}		
			
			
		} else if (tipo.equalsIgnoreCase("Alcatra")) {
			
			System.out.println("Quantos kilos de Alcatra?");		
			int carne = scan.nextInt();
			
			if(carne <= 5) {
				
				preco = carne * 5.9; 
				
			} else {
				
				preco = carne * 6.8;
				
			}
			
		} else {
			
			System.out.println("Quantos kilos de Picanha?");		
			int carne = scan.nextInt();
			
			if(carne <= 5) {
				
				preco = carne * 6.9; 
				
			} else {
				
				preco = carne * 7.8;
				
			}
		}
		
		System.out.println("Vai pagar com cartão tabajara?");
		String cliente = scan.next();
		
		double desconto = (cliente.equalsIgnoreCase("sim")) ? 0.05 : 0;
		System.out.println("O preço total é: R$" + (preco - preco*desconto));
	}
}
