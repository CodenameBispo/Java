package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int menor = 0;
		int maior = 0;
		int soma =0;
		int n = 0;
		do {
			System.out.println("Qual o tamanho do conjunto?");
			 n = scan.nextInt();		
			
			System.out.println("Digite os " + n + " numeros");
			
			for( i=0 ; i < n ; i++) {
				
				int num = scan.nextInt();
				
				if(num <= 0 || num >= 1000) {
					System.out.println("Valor não permitido \n");
					i=n;
				} else {
					
					if(num >= maior) {
						maior = num;
						
					} else {
						menor = num;
					}
					
					if(num < menor || menor == 0) {
						menor = num;
					}
					
					soma += num;
				}
				
				

			}
		} while( i != n);
			
			
		System.out.println("O menor numero é: " + menor);
		System.out.println("O maior numero é: " + maior);
		System.out.println("A soma de todos os numeros é: " + soma);
		
	}
}
