package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio21 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		if(num % 2 != 0 ) {
			
			for (int i = 3; i <= 9 ; ) {
				
				if(num % i != 0 || num == i) {
					
					i += 2;
					
					if(i == 9 && num % i !=0) {
						System.out.println("É primo");
					}
					
				} else {
					System.out.println("Não é primo");
					break;
				}				
			}			
			
		} else {
			if(num == 2) {
				System.out.println("É primo");
			} else {
				System.out.println("Não é primo");
			}
		}
		
		
		
		
	}
}
