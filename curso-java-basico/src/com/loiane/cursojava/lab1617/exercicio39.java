package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio39 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.#");
		
		int cod = 0;
		double maior =0;
		double menor =0;
		int codB = 0;
		int codS = 0;
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite o código do aluno:");
			cod = scan.nextInt();
			
			System.out.println("Digite a altura do aluno");
			double alt = scan.nextDouble();
			
			if(menor == 0 || alt < menor) {
				menor = alt;
				codS = cod;
			} else if(alt > maior) {
				maior = alt;
				codB = cod;
			}
		}
		System.out.println("Maior Aluno - Cod: " + codB + " , Altura: " + maior);
		System.out.println("Menor Aluno - Cod: " + codS + " , Altura: " + menor);
	}

}
