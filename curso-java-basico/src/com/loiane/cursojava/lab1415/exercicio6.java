package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três numeros: ");
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		
		if (numA > numB && numA > numC) {
			
			System.out.println("O maior numero é: " + numA);
			
		} else if (numB > numA && numB > numC) {
			
			System.out.println("O maior numero é: " + numB);
			
		} else {
			
			System.out.println("O maior numero é: " + numC);
		}
	}
}
