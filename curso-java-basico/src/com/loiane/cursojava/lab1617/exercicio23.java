package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio23 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor final ?");
		int n = scan.nextInt();		
				
		for (int i = 1 ; i < n ; i++) {
			
			if(i == 1 || i == 2 || i == 3 || i == 5 || i == 7) {
				
				System.out.print(i + " ");
				
			} else 
				
				if(i % 2 !=0 && i % 3 !=0 && i % 5 !=0 && i % 7 !=0  ){
					
					System.out.print(i + " ");
				} 
		}
			
		
			
		
		
	}
}
