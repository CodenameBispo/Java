package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano");
		int ano = scan.nextInt();
		
		if (ano % 100 == 0) {
			
			if(ano % 400 == 0) {
				System.out.println("O ano é bissexto");
			} else {
				System.out.println("O ano não é bissexto");
			}
			
		} else if(ano % 4 == 0){
			
			System.out.println("O ano é bissexto");
			
		} else {
			
			System.out.println("O ano não é bissexto");
		}
	}
}
