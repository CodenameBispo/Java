package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três numeros ");
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		int valor3 = scan.nextInt();
		
		
		if (valor1 > valor2 && valor1 > valor3) {			
			
			if (valor2 > valor3) {
				
				System.out.println("A sequência é: " + valor1 + ", " + valor2 + ", " + valor3);
				
			} else {
				
				System.out.println("A sequência é: " + valor1 + ", " + valor3 + ", " + valor2);
				
			}
			
		} else if (valor2 > valor1 && valor2 > valor3){
			
			if (valor1 > valor3) {
				
				System.out.println("A sequência é: " + valor2 + ", " + valor1 + ", " + valor3);
				
			} else {
				
				System.out.println("A sequência é: " + valor2 + ", " + valor3 + ", " + valor1);
			}
					
		} else {
			
			if(valor1 > valor2) {
				
				System.out.println("A sequência é: " + valor3 + ", " + valor1 + ", " + valor2);	
				
			} else {
				
				System.out.println("A sequência é: " + valor3 + ", " + valor2 + ", " + valor1);				
			}	
		}
	}
}
