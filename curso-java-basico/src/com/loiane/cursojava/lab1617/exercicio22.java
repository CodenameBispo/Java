package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio22 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		if(num % 2 != 0 ) {
			
			for (int i = 3; i <= 7 ; ) {
				
				if(num % i != 0 || num == i) {
					
					i += 2;
					
					if(i == 7) {
						System.out.println("É primo");
					}
					
				} else {
					System.out.println("Não é primo");
					System.out.print("O número " + num + " é divisivel por: ");
					for(int j = 1 ; j <= num ; ) {
						
						if(num % j == 0) {
							System.out.print( j +", ");
							j += 2;
						} else {
							j +=2;
						}
						
					}
					break;
				}				
			}			
			
		} else {
			if(num == 2) {
				System.out.println("É primo");
			} else {
				System.out.println("Não é primo");
				System.out.print("O número " + num + " é divisivel por: 1");
				for(int i = 2 ; i <= num ; ) {
					
					if(num % i == 0) {
						System.out.print(", " + i );
						i += 2;
					} else {
						i +=2;
					}
				}
			}
		}
		
		
		
		
	}
}
