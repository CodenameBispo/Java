package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio13 {
	 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double pesoIdeal = 0.0;
		System.out.println("Digite a sua altura:");
		double alt = scan.nextDouble();
		
		System.out.println("Qual seu sexo?");
		System.out.println("1- Masculino ou 2- Feminino");
		int sexo = scan.nextInt();
		
		if (sexo == 1) {
			pesoIdeal = (72.7*alt)-58;
		} else {
			pesoIdeal = (62.1*alt) - 44.7;
		}
		
		System.out.println("Qual o seu peso?");
		double peso = scan.nextDouble();
		
		if (peso == pesoIdeal) {
			System.out.println("Você está no peso ideal");			
		} else if(peso < pesoIdeal){
			System.out.println("Você está abaixo do peso ideal");			
		} else {
			System.out.println("Você está acima do peso ideal");
		}
		
	}
}
