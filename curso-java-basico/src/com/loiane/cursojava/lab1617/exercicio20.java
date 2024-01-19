package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio20 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			
		int ant = 0;
		int n = 0;
		do {
			
			System.out.println("Qual o valor do fatorial? ");
			n= scan.nextInt();
			
			System.out.print(n + "! = " + n);
			for( int i=n ; i > 0 ; i--) {
				
				if(i > 1) {
					
					System.out.print( "." + (i-1));	
					n*=i-1;	
						
					
				} else {
					
					System.out.print(" = " + n);
				}
		} 
		
			System.out.println("\n");
			
				 
		}while( n != 0);	
		
		
		
	}
}
