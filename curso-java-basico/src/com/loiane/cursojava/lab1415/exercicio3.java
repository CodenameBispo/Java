package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite M ou F para determinar o seu sexo ");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("m")) {
			
			System.out.println("M - Masculino");
			
		} else if (sexo.equalsIgnoreCase("f")){
			
			System.out.println("F - Feminino");
			
		} else {
			
			System.out.println("Sexo Inválido");
		}
	}
}
