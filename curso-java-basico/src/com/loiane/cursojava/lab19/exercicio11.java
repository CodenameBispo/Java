package com.loiane.cursojava.lab19;

import java.util.Scanner;

public class exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();			
				
		}
		
		System.out.println("Vetor Pares:" );
		System.out.print("{");
		for(int i=0; i<10 ; i++) {
			
			if(vetorA[i] % 2 == 0) {
				
				if(i == 9) {
					System.out.print(vetorA[i] + "}");
				} else {
					System.out.print(vetorA[i] + ", ");
				}
			}
			
		}
	}
}
