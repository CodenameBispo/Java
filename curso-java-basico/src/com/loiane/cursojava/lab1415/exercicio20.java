package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio20 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as três notas");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double media = (nota1 + nota2+nota3)/3 ;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção - > Média " + media);
		} else if (media >= 7) {
			System.out.println("Aprovado - > Média " + media);
		} else {
			System.out.println("Reprovado - > Média " + media);
		}
	}
}
