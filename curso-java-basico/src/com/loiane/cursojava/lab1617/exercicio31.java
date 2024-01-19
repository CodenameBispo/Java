package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio31 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		double preco = 0;
		int i = 1 ;
		double soma = 0;
		
		System.out.println("Lojas Tabajara");
		System.out.println("Digite o valor do item ou 0 para finalzar:");
		do {			
			
			preco = scan.nextDouble();
			
			if(preco != 0) {
				
				
				System.out.println("Produto " + i + ": R$ " + formato.format(preco));
				soma += preco;
				i++;
				
			} else {
				if(i-1 == 0) {
					
					System.out.println("Nenhum produto adicionado\n");	
					
				} else {
					
					System.out.println("Total: R$ " + formato.format(soma));
					System.out.println("Digite o valor a ser pago em dinheiro");
					double pay = scan.nextDouble();
					System.out.println("Dinheiro: R$ " + formato.format(pay));
					System.out.println("Troco: R$ " + formato.format(pay-soma));
				}
			}
			 
					
			
			
			
			
		}while(preco != 0);
				

		
	}	
	
}
