package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numA = scan.nextInt();
		
		System.out.println("Digite o outro");
		int numB = scan.nextInt();
		int soma = 0;
		if(numA > numB) {		
			
			for(int i = numB ; i <= numA ; i++) {
				System.out.print(i+ " ");
				soma += i;
			}
			
		} else {
			
			for(int i = numA ; i <= numB ; i++) {
				System.out.print(i + " ");
				soma += i;
			}
		}
		System.out.println("\nA soma de todos os numeros é: " + soma);
		
	}
}
