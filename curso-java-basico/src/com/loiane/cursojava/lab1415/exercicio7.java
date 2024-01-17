package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três numeros: ");
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		
		
		if (numA > numB && numA > numC) {			
			
			if (numB > numC) {
				
				System.out.println("O maior numero é: " + numA);
				System.out.println("O menor numero é: " + numC);
			} else {
				System.out.println("O maior numero é: " + numA);
				System.out.println("O menor numero é: " + numB);
			}
			
		} else if (numB > numA && numB > numC) {
			
			if (numA > numC) {
				
				System.out.println("O maior numero é: " + numB);
				System.out.println("O menor numero é: " + numC);
			} else {
				System.out.println("O maior numero é: " + numB);
				System.out.println("O menor numero é: " + numA);
			}			
			
		} else {
			
			if(numA > numB) {
				
			System.out.println("O maior numero é: " + numC);
			System.out.println("O menor numero é: " + numB);
			} else {
				System.out.println("O maior numero é: " + numC);
				System.out.println("O menor numero é: " + numA);
			}
		}
	}
}
