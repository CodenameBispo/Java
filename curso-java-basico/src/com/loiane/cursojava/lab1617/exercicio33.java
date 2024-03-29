package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio33 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.#");
		
		double maior = 0;
		double menor = 0;
		double soma = 0;
		double media = 0;
		int cont = 0;
		int opc = 0;
		
		do {
			
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Ler temperatura");
			System.out.println("2 - Finalizar");
			opc = scan.nextInt();
					
			switch(opc) {
			case 1 : 
				System.out.println("Digite o valor da temperatura");				
				double temp = scan.nextDouble();
				if(menor == 0 || temp < menor) {
					menor = temp;
				} else if(temp > maior){					
					maior = temp;
				}
				soma += temp;
				cont++;
				opc = 0;
				break;
			case 2:
				media = soma / cont;
				System.out.println("A menor temperatura foi " + menor);
				System.out.println("A maior temperatura foi " + maior);
				System.out.println("A media das temperatura foi " + formato.format(media));
				break;
				
			default: System.out.println("opção invalida");
			}
			
		}while(opc != 2);
		
	}
}
