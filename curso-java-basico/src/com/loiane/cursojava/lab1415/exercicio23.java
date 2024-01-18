package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio23 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		double num = scan.nextDouble();
		
		if (Math.ceil(num) == num) {
			System.out.println("É inteiro");
		} else {
			System.out.println("É decimal");
		}
				
	}
}
