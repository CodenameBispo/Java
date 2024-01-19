package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio16 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1; 
		int fib = 0;
		int var =0;
		int ant = 1;		
				
		
		do {
			
			if(fib > 500) {
				i=0;
			} else {
				
				System.out.println("Termo " + i + ": " + fib);	
				var = fib;
				fib += ant;			
				ant = var;
				
				
			}			
			
			i++;
			
		} while( i != 0);
		
		
	}
}
