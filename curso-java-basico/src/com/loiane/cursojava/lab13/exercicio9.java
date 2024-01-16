package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Farenheit: ");
		double tempF = scan.nextDouble();
		double tempC = (5 * (tempF-32)/9);
		
		System.out.println("A temperatura em graus Celcius é: " + tempC);
	}
}
