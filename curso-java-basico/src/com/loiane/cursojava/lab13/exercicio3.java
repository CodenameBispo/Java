package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros em sequencia: ");
		int numeroA = scan.nextInt();
		int numeroB = scan.nextInt();
		
		System.out.println("O resultado da soma dos números é: " + (numeroA + numeroB));
		
	}
}
