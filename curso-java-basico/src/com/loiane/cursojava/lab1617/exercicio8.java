package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		double num = 0;
		double total = 0;
		int i =0;
			
		for(i=1; i <= 5 ; i++) {
				
			System.out.println("Informe um número");
			num = scan.nextInt();				
			total += num;
		}			
		
		double media = total/(i-1);
		System.out.println("A média é " + media);
		
	}
}
