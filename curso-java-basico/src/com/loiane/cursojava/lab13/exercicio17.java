package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos metros quadrados serão pintados ? ");
		int areaPintada = scan.nextInt();
		int litrosTotais = 0;
		// 1 litro cobre 6m²
		// 18 litros R$ 80 
		// 3,6 litros R$ 25
		
		if (areaPintada % 6 == 0 ) {
			
			 litrosTotais = areaPintada/6;
			
		} else {
			
			 litrosTotais = areaPintada / 6 + 1;
		}
		
		System.out.println("O cliente vai precisar de " + litrosTotais + " litros de tinta");
		
		int p18 = 80;
		int p3_6 = 25;
		int nlatas18 = 0;
		double nlatas3_6= 0;
		
		
		System.out.println("Opções de compra:");
		if (litrosTotais % 18 == 0 ) {
			
			nlatas18 = litrosTotais/18;
			
		} else if( nlatas18 < 1 ) {
			
			nlatas18 = 1;
			
		} else {
			
			nlatas18 = litrosTotais/18 + 1 ;
		}		
		System.out.println(nlatas18 + " lata(s) de 18 litros no valor de R$ 80,00 cada");		
		System.out.println("Total R$ " + p18*nlatas18);
		
		if (litrosTotais % 3.6 == 0 ) {
			
			nlatas3_6 = litrosTotais/3.6;
			
		} else if( litrosTotais/3.6 < 1 ) {
			
			nlatas3_6 = 1;
			
		} else {
			
			nlatas3_6 = Math.ceil(litrosTotais/3.6);
		}
		System.out.println(nlatas3_6 + " lata(s) de 3,6 litros no valor de R$ 25,00 cada");
		System.out.println("Total R$ " + p3_6*nlatas3_6);
		
		if (litrosTotais < 18) {
			if(litrosTotais % 3.6 == 0) {
				nlatas3_6= (litrosTotais/3.6);
			} else {
				nlatas3_6 = Math.ceil(litrosTotais/3.6);
			}
		} else {
			if(litrosTotais % 18 == 0) {
				nlatas18 = (litrosTotais/18);
				nlatas3_6 = 0;
			} else {
				nlatas18 = (litrosTotais/18);
				double resto = litrosTotais%18;
				if (resto % 3.6 == 0) {
					
					nlatas3_6 = resto/3.6;
					
				} else {
					nlatas3_6 = Math.ceil(resto/3.6);
				}
			}
		}
		System.out.println(nlatas18 + " lata(s) de 18 litros no valor de R$ 80,00 cada +" + nlatas3_6 + 
				" lata(s) de 3,6 litros no valor de R$ 25,00 cada");
		double total = (p18 * nlatas18) + (p3_6 * nlatas3_6);
		System.out.println("Total R$ " + total);
		
		
	

	}

}
