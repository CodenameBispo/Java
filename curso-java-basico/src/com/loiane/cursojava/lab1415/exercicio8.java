package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor dos três produtos ");
		double valor1 = scan.nextDouble();
		double valor2 = scan.nextDouble();
		double valor3 = scan.nextDouble();
		
		
		if (valor1 > valor2 || valor1 > valor3) {			
			
			if (valor2 > valor3) {
				
				System.out.println("Compre o terceiro produto ");
				
			} else {
				System.out.println("Compre o segundo Produto");
				
			}
			
		} else {
			System.out.println("Compre o primeiro produto ");
					
		} 
	}
}
