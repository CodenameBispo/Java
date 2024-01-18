package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe os três lados do seu triângulo");
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		
		if (lado1 == lado2 && lado1 == lado3) {
			
			System.out.println("O seu triângulo é um triângulo equilátero");
			
		} else if(lado1 != lado3 && lado1 != lado2 && lado2 != lado3){			
			
			System.out.println("O seu triângulo é um triângulo Escaleno");
		} else {
			System.out.println("O seu triângulo é um triângulo Isósceles");
		}
	}
}
