package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo em centimetros:");
		double r = scan.nextDouble();
		double pi = Math.PI;
		double areac = pi * r * r ; //Math.pow( r , 2) 
		
		System.out.println("A área do circulo é: " + areac + " centimetro quadrados");
		System.out.println("Ou : " + areac/10000 + " metros quadrados" );
		
	}
}
