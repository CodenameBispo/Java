package com.loiane.cursojava.lab19;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		for(int i=0; i<8 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();
			vetorB[i]=vetorA[i]*2;
		}
		System.out.print("VetorB[]: {");
		for(int i=0; i<8 ; i++) {
			
			if(i == 7) {
				System.out.print( vetorB[i] + "}");
			} else {
				System.out.print( vetorB[i] + ", ");
			}
		}
	}
}
