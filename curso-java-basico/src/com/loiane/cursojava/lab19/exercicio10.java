package com.loiane.cursojava.lab19;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[10];
		double[] vetorB = new double[10];
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();			
			
			vetorB[i]=vetorA[i]%2;
		}
		
		System.out.print("VetorC[]: {");
		for(int i=0; i<10 ; i++) {
			
			if(i == 9) {
				System.out.print( vetorB[i] + "}");
			} else {
				System.out.print( vetorB[i] + ", ");
			}
		}
	}
}