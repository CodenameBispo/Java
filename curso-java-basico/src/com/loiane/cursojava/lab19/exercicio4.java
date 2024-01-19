package com.loiane.cursojava.lab19;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		double[] vetorB = new double[15];
		
		for(int i=0; i<15 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();
			vetorB[i]=Math.sqrt(vetorA[i]);
		}
		System.out.print("VetorB[]: {");
		for(int i=0; i<15 ; i++) {
			
			if(i == 14) {
				System.out.print( vetorB[i] + "}");
			} else {
				System.out.print( vetorB[i] + ", ");
			}
		}
	}
}
