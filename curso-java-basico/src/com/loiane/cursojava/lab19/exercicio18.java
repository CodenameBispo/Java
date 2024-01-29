package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio18 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int maior =0;
		int posMa = 0;
		int menor =0;
		int posMe = 0;
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite a " + (i+1) + "ª idade");
			vetorA[i]=scan.nextInt();			
			if(vetorA[i] > maior) {				
				maior = vetorA[i];
				posMa = i;
			}
			if(menor == 0 || vetorA[i] < menor) {
				menor = vetorA[i];
				posMe = i;
			}
		}
		
		System.out.println("A maior idade é:  " + maior + " e a sua posição no vetor é: " + posMa);
		System.out.println("A menor idade é:  " + menor + " e a sua posição no vetor é: " + posMe);
		
	}
}
