package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		do {
			
			System.out.println("Digite uma nota de 0 a 10");
			int valor = scan.nextInt();
			
			if(valor < 0 || valor >10) {
				
				System.out.println("Valor inválido");
				i = 1;
			} else {
				
				System.out.println("A nota é " + valor);
				i=0;
			}
		} while(i > 0);
	}
}