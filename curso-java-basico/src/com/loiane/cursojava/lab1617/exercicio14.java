package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int par = 0;
		int impar = 0;
		
		System.out.println("Digite dez numeros");	
		for( i=0 ; i < 10 ; i++) {		
			
			int num= scan.nextInt();
			
			if(num % 2 == 0) {
				
				par ++;
				
			} else {
				
				impar++;
			}

		}	
			
		System.out.println("A quantidade de números impares é: " + impar);
		System.out.println("A quantidade de numeros pares é: " + par);
		
	}
}
