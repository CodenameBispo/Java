package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio29 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[10];
		int[] vetorC= new int[20];
		
		
		for(int i=0; i<10 ; i++) {
			
			vetorA[i] = random.nextInt(10);
			vetorB[i] = random.nextInt(10);
			vetorC[i] = vetorA[i];
			vetorC[i+10] = vetorB[i];
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
		System.out.print("}");
	}
}
