package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Celcius: ");
		double tempC = scan.nextDouble();
		double tempF = (tempC *9 /5)+32 ;
		
		System.out.println("A temperatura em graus Farenheit é: " + tempF);
	}
}
