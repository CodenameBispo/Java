package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio24 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("Qual operação deseja realizar?");
		System.out.println("1- soma , 2- multiplicação, 3- subtração, 4- divisão");
		int opt = scan.nextInt();
		double resultado = 0;
		
		switch(opt) {
		case 1 :  resultado = num1 + num2; break;
		case 2 :  resultado = num1 * num2; break;
		case 3 :  resultado = num1 - num2; break;
		case 4 :  resultado = num1 / num2; break;
		
		}
		if (resultado % 2 == 0) {
			
			if (resultado > 0) {
				
				if (Math.ceil(resultado) == resultado) {			
					System.out.println("O valor "+ resultado + " é inteiro, positivo e par");
				} else {
					System.out.println("O valor "+ resultado + " é decimal, positivo e par");
				}
			} else {
				
				if (Math.ceil(resultado) == resultado) {			
					System.out.println("O valor "+ resultado + " é inteiro, negativo e par");
				} else {
					System.out.println("O valor "+ resultado + " é decimal, negativo e par");
				}
			}
			
		} else {
			
			if (resultado > 0) {
				
				if (Math.ceil(resultado) == resultado) {			
					System.out.println("O valor "+ resultado + " é inteiro, positivo e impar");
				} else {
					System.out.println("O valor "+ resultado + " é decimal, positivo e impar");
				}
			} else {
				
				if (Math.ceil(resultado) == resultado) {			
					System.out.println("O valor "+ resultado + " é inteiro, negativo e impar");
				} else {
					System.out.println("O valor "+ resultado + " é decimal, negativo e impar");
				}
			}
		}
		
				
	}
}
