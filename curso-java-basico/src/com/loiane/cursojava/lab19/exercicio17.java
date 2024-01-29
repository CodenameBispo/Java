package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio17 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int contSup = 0;
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite a " + (i+1) + "ª idade");
			vetorA[i]=scan.nextInt();			
			if(vetorA[i] > 35) {				
				contSup++;
			}
		}
		
		int[] vetorSup = new int[contSup];
		int j=0;
		for (int i=0; i<10 ; i++) {
			
			if(vetorA[i] > 35) {
				vetorSup[j] = vetorA[i];
				j++;
			}
		}
		System.out.print("Idades maiores que 35 anos: ");
		for (int i=0; i<contSup ; i++) {
			
			if(i == contSup-1) {
				System.out.print(vetorSup[i]);
			} else {
				System.out.print(vetorSup[i] + " , ");
			}
		}
		
		System.out.println("O numero de pessoas com mais de 35 anos é:  " + contSup);
		
	}
}
