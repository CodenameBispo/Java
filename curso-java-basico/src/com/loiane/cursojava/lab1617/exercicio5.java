package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int popA = 0;
		int popB = 0;
		double taxA = 0;
		double taxB = 0;		
		int anos = 0;
		
		do {
		System.out.println("Digite a população de A");
		 popA = scan.nextInt();
		System.out.println("Digite a taxa de crescimento de A");
		 taxA = scan.nextDouble();
		System.out.println("Digite a população de B");
		 popB = scan.nextInt();
		System.out.println("Digite a taxa de crescimento de B");
		 taxB = scan.nextDouble();
		if(popB < popA) {
			System.out.println("A população de A já é maior que B \n");
		}
		
		}while(popB < popA);
		
		do {
			
			popA += popA*taxA;
			popB += popB*taxB;
			anos ++;
			
		} while(popA < popB);
		
		System.out.println("A população A tem " + popA + " habitantes, enquanto a população B tem " + popB + " habitantes");
		System.out.println("A poupalação A demorou " + anos + " anos para ultrapassar a população B");
	}
}
