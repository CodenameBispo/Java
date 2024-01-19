package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio27 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos kilos de maçã?");		
		int maca = scan.nextInt();
		
		System.out.println("Quantos kilos de morango?");
		int morango = scan.nextInt();
		double precoMc = 0;
		double precoMo = 0;
		double precoT = 0;
		
		
		if (morango <= 5) {
			
			precoMo = morango * 2.5;			
			
		} else {			
			
			precoMo = morango * 2.2;
		}
		
		if (maca <= 5) {
			
			precoMc = maca * 1.8;			
			
		} else {			
			
			precoMc = maca * 1.5;
		}
		
		precoT = precoMo + precoMc;
		
		if (precoT > 25 || morango + maca > 8) {
			
			precoT -= precoT*0.1;
		} 
		
		System.out.println("O preço total é: R$" + precoT);
	}
}
