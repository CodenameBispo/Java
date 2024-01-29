package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio31 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] vetorA= new int[20];
		int[] vetorB= new int[20];
		for(int i=0; i<20 ; i++) {
			
			vetorA[i] = random.nextInt(50);
			
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];				
			}
		}
		
		for(int i=0; i<20; i++) {
			if(vetorA[i] % 2 != 0) {
				vetorB[19-i] = vetorA[i];
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
		
	}
}
