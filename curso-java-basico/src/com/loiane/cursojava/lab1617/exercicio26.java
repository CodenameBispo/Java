package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio26 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int votosA = 0;
		int votosB = 0;
		int votosC = 0;
		int opc = 0;
		
		do {
			
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Votar");
			System.out.println("2 - Finalizar");
			opc = scan.nextInt();
					
			switch(opc) {
			case 1 : 
				System.out.println("Selecione o candidato");
				System.out.println("1 - candidato A");
				System.out.println("2 - candidato B");
				System.out.println("3 - candidato C");
				int voto = scan.nextInt();
				
				switch(voto) {
				case 1: votosA++; break;
				case 2: votosB++; break;
				case 3: votosC++; break;			
				}
				opc = 0;
				break;
			case 2:	
				System.out.println("A quantidade de votos do candidato A foi " + votosA);
				System.out.println("A quantidade de votos do candidato B foi " + votosB);
				System.out.println("A quantidade de votos do candidato C foi " + votosC);
				break;
				
			default: System.out.println("opção invalida");
			}
			
		}while(opc != 2);
		
	}
}
