package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio16 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int A = scan.nextInt();
		
		if (A == 0) {
			
			System.out.println("Não é uma equação de segundo grau, programa encerrado!");
			
		} else {
			
			System.out.println("Digite o valor de B:");
			int B = scan.nextInt();
			System.out.println("Digite o valor de C:");
			int C = scan.nextInt();
			
			double delta = Math.pow(B, 2) - 4*A*C;
			
			if(delta < 0) {
				
				System.out.println("Delta negativo, programa encerrado!");
				
			} else if(delta > 0){
				
				double x1 = (-B + Math.sqrt(delta))/2*A;
				double x2 = (-B - Math.sqrt(delta))/2*A;
				
				System.out.println("A equação possui duas raízes reais!");
				System.out.println("Raízes: x1 = " + x1 + " x2 = " + x2);
				
			} else {
				
				double x1 = -B /2*A;
						
				System.out.println("Delta é igual a 0, só existe uma raiz: " + x1);				
			}
		}
	}
}
