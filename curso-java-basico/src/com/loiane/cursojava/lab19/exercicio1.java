package com.loiane.cursojava.lab19;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		for(int i=0; i<5 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();
			vetorB[i]=vetorA[i];
		}
		System.out.print("VetorB[]: {");
		for(int i=0; i<5 ; i++) {
			
			if(i == 4) {
				System.out.print( vetorB[i] + "}");
			} else {
				System.out.print( vetorB[i] + ", ");
			}
			
			
			
		}
	}
}
