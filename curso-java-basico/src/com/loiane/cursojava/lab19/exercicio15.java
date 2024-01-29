package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio15 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		double contPar = 0;
		double contImpar = 0;
		
		
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();			
			if(vetorA[i] % 2 == 0) {
				
				contPar++;	
			} else {
				
				contImpar++;
			}
		}		
	
		double pares = contPar/10*100;
		double impares = contImpar/10*100;
		System.out.println("Percentual de elementos pares: " + formato.format(pares) + "%");
		System.out.println("Percentual de elementos impares: " + formato.format(impares)+ "%");
		
	}
}
