package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio14 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as duas notas");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2)/2 ;
		String conceito = "";
		String status = "";
		
		if (media < 4) {
			
			conceito = "E";	
			
		} else if (media >= 4 && media < 6) {
			
			conceito = "D";
			
		} else if (media >= 6 && media < 7.5){
			
			conceito = "C";
			
		} else if (media >= 7.5 && media < 9) {
			
			conceito = "B";
		} else {
			
			conceito = "A";
		}
		
		if (conceito.equalsIgnoreCase("D") || conceito.equalsIgnoreCase("E") ) {
			
			status = "Reprovado";
			
		} else {
			
			status = "Aprovado";
		}
		
		System.out.println("Nota 1	Nota2	Média	Conceito	Status");
		System.out.println(" " + nota1 + "	 " + nota2 + "	 " + media + "	   " + conceito + "	 	" + status);
	}
}
