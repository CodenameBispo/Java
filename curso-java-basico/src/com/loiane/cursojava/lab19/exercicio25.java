package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio25 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[10];
		
		for(int i=0; i<10 ; i++) {
			
			vetorA[i] = random.nextInt(100);
			if(vetorA[i] % 2 == 0) {
				
				vetorB[i] = 1;
			} else {
				
				vetorB[i] = 0;
			}
		}
		System.out.println("Vetor B:");
		
		System.out.print("{ ");
		for(int elemento : vetorB) {
			
			System.out.print(elemento + " ");		
		}
		System.out.print("}");
	}
}
