package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana (1 a 7)");
		int diaS = scan.nextInt();
		
		if (diaS == 1) {
			
			System.out.println("Segunda-feira");
			
		} else if (diaS == 2) {
			
			System.out.println("Terça-feira");
			
		}	else if (diaS == 3) {
			
			System.out.println("Quarta-Feira");
			
		} else if (diaS == 4) {
			
			System.out.println("Quinta-Feira");
			
		} else if (diaS == 5) {
			
			System.out.println("Sexta-Feira");
			
		} else if (diaS == 6) {
			
			System.out.println("Sábado");
			
		} else if (diaS == 7) {
			
			System.out.println("Domindo");		
			
		} else {
			System.out.println("Dia da semana invalido");
		}
		
		switch(diaS) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: System.out.println("Dia da semana"); break;
		case 6: 
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("Dia da semana invalido");
		}
	}
}
