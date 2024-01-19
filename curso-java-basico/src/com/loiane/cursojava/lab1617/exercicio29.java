package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio29 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		
		
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for (int i = 1 ; i <= 50 ; i++) {
			
			String preco = formato.format(1.99*i);
			System.out.println(i + " - R$ " + preco);			

		}
	}	
}
