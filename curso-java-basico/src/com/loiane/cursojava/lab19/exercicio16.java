package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio16 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int contSup = 0;
		int [] vetorSoma = new int [3];
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite o " + (i+1) + " valor do vetor A");
			vetorA[i]=scan.nextInt();			
			if(vetorA[i] < 15) {
				
				vetorSoma[0]+= vetorA[i];
				
			} else if(vetorA[i] == 15){
				
				vetorSoma[1]+= vetorA[i];
			} else {
				contSup++;
				vetorSoma[2]+= vetorA[i];
			}
		}
		
		double mediaSup = vetorSoma[2]/contSup;
		System.out.println("Soma dos valores menores que 15 =  " + vetorSoma[0]);
		System.out.println("Soma dos valores iguais a 15 =  " + vetorSoma[1]);
		System.out.println("Media dos valores maiores que 15 =  " + formato.format(mediaSup));
		
	}
}
