package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int pesoMax = 50;
		
		System.out.println("Digite o peso total dos peixes: ");
		double peso = scan.nextDouble();
		
		double excesso = peso - pesoMax;
		if (peso < pesoMax) {
			excesso = 0;
		}
		double multa = excesso * 4;
		
		System.out.println("O excesso de peso foi de: " + excesso);
		System.out.println("A multa a ser paga é de R$ " + multa);
		
		
		
	}
}
