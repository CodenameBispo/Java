package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio37 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		
		int cod = 0;
		double alt = 0;
		double peso = 0;
		int codB = 0;
		int codS = 0;
		int codF = 0;
		int codSk = 0;
		double maior =0;
		double menor =0;
		double gordo = 0;
		double magro = 0;		
		
		
		
		System.out.println("Responda as perguntas abaixo ou 0 para finalizar\n");
		do {			
			
			
			System.out.println("Qual o seu código?");
			cod = scan.nextInt();
			if(cod != 0) {
				
				System.out.println("Qual a sua altura em metros?");
				alt = scan.nextDouble();
				
				System.out.println("Qual o seu Peso?");
				peso = scan.nextDouble();
				
				if(menor == 0 || alt < menor) {
					menor = alt;
					codS = cod;
				} else if (alt > maior) {
					maior = alt;
					codB = cod;
				}
				
				if(magro == 0 || peso < magro) {
					magro = peso;
					codSk = cod;
				} else if (peso > gordo) {
					gordo = peso;
					codF = cod;
				}
				cod = -1;
			} else {
				if(menor == 0) {
					System.out.println("Nenhum dado foi digitado\n");
					System.out.println("Responda as perguntas abaixo ou 0 para finalizar\n");
					cod = -1 ;
				}
				
				System.out.println("Mais alto - Cod: " + codB + ", Altura: " + maior);
				System.out.println("Mais baixo - Cod: " + codS + ", Altura: " + menor);
				System.out.println("Mais pesado - Cod: " + codF + ", Peso: " + gordo);
				System.out.println("Mais leve - Cod: " + codSk + ", Peso: " + magro);
			}
			
		}while(cod != 0);
				

		
	}	
	
}
