package com.loiane.cursojava.lab19;

import java.util.Scanner;

public class exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();
			System.out.println("Digite o " + (i+1) + " valor do vetor B");
			vetorB[i]=scan.nextInt();
			
			vetorC[i]=vetorA[i]-vetorB[i];
		}
		
		System.out.print("VetorC[]: {");
		for(int i=0; i<10 ; i++) {
			
			if(i == 9) {
				System.out.print( vetorC[i] + "}");
			} else {
				System.out.print( vetorC[i] + ", ");
			}
		}
	}
}
