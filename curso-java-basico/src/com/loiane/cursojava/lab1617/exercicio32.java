package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio32 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		
	
		System.out.println("Digite o valor para calcular o fatorial");
		int n = scan.nextInt();
		
		System.out.print(n + "! = ");
		for(int i=n ; i > 0 ; i--) {
			
			n*= i-1;
			
			if(i==1) {				
				System.out.print(i);				
			} else {				
				System.out.print(i + " . ");
			}
			
		}
		 System.out.print(" = " + 120);
				

		
	}	
	
}
