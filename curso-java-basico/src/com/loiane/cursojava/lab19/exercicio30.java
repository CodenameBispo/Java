package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio30 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] vetorA= new int[20];
		int contPar = 0;
		int contImpar = 0;
		
		for(int i=0; i<20 ; i++) {
			
			vetorA[i] = random.nextInt(50);
			if(vetorA[i] % 2 == 0) {
				
				contPar++;
			} else {
				
				contImpar++;
			}
		}
		
		int[] vetorB= new int[contPar];
		int[] vetorC= new int[contImpar];
		int j =0;
		int k=0;
		
		for(int i=0; i< 20 ; i++) {
			
			if(vetorA[i] % 2 == 0) {
				
				vetorB[j] = vetorA[i];
				j++;
			} else {
				
				vetorC[k] = vetorA[i];
				k++;
			}
			
		}
		System.out.println("Vetor A:");		
		System.out.print("{ ");
		for(int elemento : vetorA) {
			
			System.out.print(elemento + " ");		
		}
		System.out.print("}\n");
		
		System.out.println("Vetor B:");		
		System.out.print("{ ");
		for(int elemento : vetorB) {
			
			System.out.print(elemento + " ");		
		}
		System.out.print("}\n");
		
		System.out.println("Vetor C:");
		System.out.print("{ ");
		for(int elemento : vetorC) {
			
			System.out.print(elemento + " ");		
		}
		System.out.print("}\n");
		
	}
}
