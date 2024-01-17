package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		
		if (numA > numB) {
			
			System.out.println("O maior numero é: " + numA);			
		} else {
			System.out.println("O maior numero é: " + numB);
		}
		
	}
}
