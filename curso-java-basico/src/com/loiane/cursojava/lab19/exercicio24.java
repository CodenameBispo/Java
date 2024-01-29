package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio24 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] vetor= new int[10];
		boolean vetorPalindromo = true;
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite o " + (i+1) + "º valor :");
			vetor[i]= scan.nextInt();
				
		}
		
		for(int i=0; i<10 ; i++) {
			
			if(vetor[i] != vetor[9-i]) {
				vetorPalindromo = false;
				break;
			}
				
		}
		
		
		if(vetorPalindromo) {
			System.out.println("É um vetor Palindromo");
		} else {
			System.out.println("Não é um vetor Palindromo. Processo encerrado");
		}
		
		
	}
}