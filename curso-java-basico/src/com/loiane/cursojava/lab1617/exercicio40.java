package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio40 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.#");
		
		int cod = 0;
		double maior =0;
		double menor =0;
		int codMa = 0;
		int codMe = 0;
		int soma = 0;
		int somaA = 0;
		int cont =0;
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite o código da cidade");
			cod = scan.nextInt();
			
			System.out.println("Digite o número de carros");
			double car = scan.nextDouble();
			
			System.out.println("Digite o número de acidentes com vitimas");
			int num = scan.nextInt();
			
			double indice = num/car;
			 
			if(menor == 0 || indice < menor) {
				menor = indice;
				codMe = cod;
			} else if(indice > maior) {
				maior = indice;
				codMa = cod;
			}
			
			soma += car;
			if(car<2000) {
				somaA += num;
				cont++;
			}
		}
		System.out.println("Maior Indice de acidentes por carro - Cod da cidade: " + codMa + " , Indice: " + formato.format(maior));
		System.out.println("Menor Indice de acidentes por carro - Cod da cidade: " + codMe + " , Indice: " + formato.format(menor));
		System.out.println("Média de veiculos das cinco cidades: " + Math.ceilDiv(soma, 5));
		System.out.println("Média de acidentes em cidades com menos de 2000 carros: " + formato.format(somaA/cont));
	}

}
