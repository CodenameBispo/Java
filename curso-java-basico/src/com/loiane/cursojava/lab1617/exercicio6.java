package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Como quer que os valores sejam impressos? Vertical ou Horizontal?");
		String modo = scan.next();
		
		if(modo.equalsIgnoreCase("Vertical")) {
			
			for(int i=1; i <= 20 ; i++) {
				
				System.out.println(i);
			}
			
		} else {
			
			for(int i=1; i <= 20 ; i++) {
				
				System.out.print(i+ " ");
			}
		}
	}
}