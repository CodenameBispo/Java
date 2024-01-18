package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado:");
		double l = scan.nextDouble();
		double area	= Math.pow(l, 2);
		
		System.out.println("A área do quadrado é : " + area);
		System.out.println("O dobro da Área é : " + area*2);
	}
}
