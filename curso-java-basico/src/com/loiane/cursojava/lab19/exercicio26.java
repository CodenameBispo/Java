package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio26 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[10];
		int[] vetorC= new int[10];
		
		for(int i=0; i<10 ; i++) {
			
			vetorA[i] = random.nextInt(100);
			vetorB[i] = random.nextInt(100);
			if(vetorA[i] > vetorB[i]) {
				
				vetorC[i] = 1;
			} else if(vetorA[i] == vetorB[i]){
				
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
		}
		System.out.println("Vetor C:");
		
		System.out.print("{ ");
		for(int elemento : vetorC) {
			
			System.out.print(elemento + " ");		
		}
		System.out.print("}");
	}
}
