package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros e um real: ");
		double inteiro1 = scan.nextDouble();
		double inteiro2 = scan.nextDouble();
		double real = scan.nextDouble();
		
		double calc1 = (inteiro1 * 2) * 
				(inteiro2 / 2);
		double calc2 = (inteiro1 * 3) + real;
		double calc3 = real * real * real; 
		
		System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + calc1);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + calc2);
		System.out.println("O terceiro elevado ao cubo é: " + calc3);
	}
}
