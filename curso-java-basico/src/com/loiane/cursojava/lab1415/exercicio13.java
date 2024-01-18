package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana (1 a 7)");
		int diaS = scan.nextInt();				
		
		switch(diaS) {
		case 1: System.out.println("Domindo"); break;
		case 2: System.out.println("Segunda-Feira"); break;
		case 3: System.out.println("Terça-Feira"); break;
		case 4: System.out.println("Quarta-Feira"); break;
		case 5: System.out.println("Quinta-Feira"); break;
		case 6: System.out.println("Sexta-Feira"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Dia da semana invalido");
		}
	}
}
