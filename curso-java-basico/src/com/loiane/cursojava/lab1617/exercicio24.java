package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio24 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Quantas notas serão calculadas?");
		int n = scan.nextInt();		
		int i = 0;
		double soma = 0;
		
		for (i = 0 ; i < n ; i++) {
			
			System.out.println("Digite a nota:");
			soma += scan.nextDouble();
			
		}
		System.out.println("A média é: " + soma/i);
		
			
		
		
	}
}
