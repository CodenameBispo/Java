package com.loiane.cursojava.lab19;

import java.util.Scanner;

public class exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int cont = 0;
		
		
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();			
			if(vetorA[i] % 2 != 0) {
				cont++;	
			}	
		}		
		int [] vetorImpar = new int[cont];
		int j = 0;
		for (int i=0; i<10 ; i++) {
			
			if(vetorA[i] % 2 != 0) {
				vetorImpar[j] = vetorA[i];	
				j++;
			}
		}
		
		System.out.print("media dos numeros impares do vetor: " );
		int soma = 0;
		
		
		for(int i=0; i<cont ; i++) {
			
			if(i == cont-1) {				
					System.out.print(vetorImpar[i]);
					System.out.print(" = ");
					soma += vetorImpar[i];
			} else {
					System.out.print(vetorImpar[i]);
					System.out.print(" + ");
					soma += vetorImpar[i];
			}	
		}	

		double media = soma/cont;
		System.out.println(media);
	}
}
