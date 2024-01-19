package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio30 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		
		System.out.println("informe o preço do pão");
		double n = scan.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for (int i = 1 ; i <= 50 ; i++) {
			
			String preco = formato.format(n*i);
			System.out.println(i + " - R$ " + preco);			

		}
	}	
}
