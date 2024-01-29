package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio20 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		double[] real= new double[21];
		double cotacao = 4.95;
		
		System.out.println("Tabela de conversão dolar - real");
		System.out.println("\n Dolar  | Real");
		for(int i=0; i<21 ; i++) {
			
			real[i] = cotacao * (i);
			System.out.println(" R$" + i + "  -  R$" + formato.format(real[i]));
		}	
	}
}
