package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio12 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua altura:");
		double alt = scan.nextDouble();
		
		System.out.println("O seu peso ideal é: " + ((72.7*alt) - 58)+ "kilos");
	}
}