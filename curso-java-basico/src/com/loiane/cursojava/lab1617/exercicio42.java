package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio42 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		int num = 0;
		int cont25 = 0 ;
		int cont50 = 0 ;
		int cont75 = 0 ;		
		int cont100 = 0 ;
		
		System.out.println("Digite os valores do item ou coloque um número negativo para finalzar:");
		do {			
			
			num = scan.nextInt();
			if(num > 0) {
				
				if(num <= 25) {
					
					cont25++;				
					
				} else if(num <= 50) {
					
					 cont50++;
					 
				} else if(num <=75) {
					
					cont75++;
					
				} else if(num <= 100){
					
					cont75++;
					
				} else {
					
					System.out.println("Valor inválido");
					
				}
			} else {
				
				if(cont25 == 0 && cont50 == 0 && cont75 == 0) {
					System.out.println("Nenhum valor foi informado");
					num = 0;
				}
				
				System.out.println("\n[0 - 25] - " + cont25);
				System.out.println("[26 - 50] - " + cont50);
				System.out.println("[51 - 75] - " + cont75);
				System.out.println("[76 - 100] - " + cont100);
			}
			

			
		}while(num >= 0);
	}	
}
