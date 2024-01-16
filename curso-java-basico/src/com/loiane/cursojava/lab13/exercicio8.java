package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Qual o valor da sua hora de trabalho ? ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalha no mês? ");
		int horasTrab = scan.nextInt();
		
		System.out.println("O valor recebido no final do mês é: " + (valorHora * horasTrab));
	}
}
