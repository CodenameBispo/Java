package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio22 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("É Par");
		} else {
			System.out.println("É impar");
		}
				
	}
}
