package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio13 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número base");
		int numA = scan.nextInt();
		
		System.out.println("Digite o número expoente");
		int numB = scan.nextInt();
		
		int resultado = 1;
		
		System.out.print(numA + "^"  + numB + ": ");
		for(int i = 1; i <= numB; i++ ) {
			String sinal = "";
			if(i== numB) {
				System.out.print(numA + " = ");
			} else {
				System.out.print(numA + " * ");
			}
			resultado *= numA;
		}
		System.out.print(resultado);
	}
}
