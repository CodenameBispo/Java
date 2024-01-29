package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio27 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] vetorA= new int[10];
		char[] vetorB= new char[10];
		
		
		for(int i=0; i<10 ; i++) {
			
			vetorA[i] = random.nextInt(12);
			if(vetorA[i] < 7) {
				
				vetorB[i] = 'a';
			} else if(vetorA[i] == vetorB[i]){
				
				vetorB[i] = 'b';
			} else if( vetorA[i] > 7 && vetorA[i]<10){
				vetorB[i] = 'c';
			} else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else {
				vetorB[i] = 'e';
			}
		}
		System.out.println("Vetor B:");
		
		System.out.print("{ ");
		for(char elemento : vetorB) {
			
			System.out.print(elemento + " ");		
		}
		System.out.print("}");
	}
}
