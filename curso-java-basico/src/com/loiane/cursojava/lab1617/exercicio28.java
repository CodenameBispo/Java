package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio28 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		
		System.out.println("Quantos CDs possui?");
		int cd = scan.nextInt();
		
		double soma =0 ; 				
		
		for (int i = 0 ; i < cd ; i++) {
			
			System.out.println("Digite o preço do " + (i+1) +  "º CD");			
			
			soma += scan.nextDouble();		
			
			
			
		}
		 String media = formato.format(soma/cd);
		System.out.println("A média de preço dos Cds é de R$ " + media);
	}	
}
