package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quais valores você quer que seja impresso? Impares ou Pares?");
		String modo = scan.next();
		
		if(modo.equalsIgnoreCase("Pares")) {		

			for(int i=1; i < 50 ; i++) {
				
				if(i % 2 == 0) {
					
					System.out.print(i+ " ");
				
				} 					
			}
			
		} else {
			
			for(int i=1; i < 50 ; i++) {
				
				if(i % 2 != 0) {
					
					System.out.print(i+ " ");
				
				} 					
			}
		}
	}
}
