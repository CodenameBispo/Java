package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int fib = 1;
		int var =0;
		int ant = 0;
		
		System.out.println("Digite até qual termo você quer a sérei de Fibonacci");
		int n= scan.nextInt();
		
		for( i=1 ; i <= n ; i++) {	
			
			System.out.println("Termo " + i + ": " + fib);	
			var = fib;
			fib += ant;			
			ant = var;		
				 
		}	
			
		
		
	}
}
