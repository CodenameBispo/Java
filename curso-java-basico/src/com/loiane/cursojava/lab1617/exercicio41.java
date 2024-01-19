package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio41 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		
		System.out.println("Digite o valor da sua dívida");
		double valor = scan.nextDouble();		
		
		int taxa = 0;
		
		System.out.println("Valor da dividida | Valor dos Juros | Quantidade de parcelas | Valor da Parcela");
		for(int i = 1; i<= 24; i++) {
			
			if(i == 1) {				
				System.out.println("R$ " + formato.format(valor+valor*taxa/100) + "		" + formato.format(valor*taxa/100)+ "			" + i + "		R$	" + 
						formato.format(valor/i));
			} else if(i % 3 == 0) {
				taxa += 5;
				double novoValor = valor+valor*taxa/100;
				System.out.println("R$ " + formato.format(novoValor) + "		" + formato.format(valor*taxa/100)+ "			" + i + "		R$	" + 
						formato.format(novoValor/i));
			}
	
		}
		
	}
}
