package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Qual o valor da sua hora de trabalho ? ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalha no mês? ");
		double horasTrab = scan.nextInt();
		
		double salarioBruto = (valorHora * horasTrab);
		double salarioLiq = salarioBruto - 0.11 * salarioBruto - 0.08 * salarioBruto - 0.05 * salarioBruto; 
		System.out.println("O valor Bruto recebido no final do mês é: " + salarioBruto);
		System.out.println("O valor pago ao INSS é: " + (0.11 * salarioBruto));
		System.out.println("O valor pago ao Sindicato é: " + (0.05 * salarioBruto));
		System.out.println("O valor liquido recebido no final do mês é: " + salarioLiq);
		
		System.out.println(" + Salário Bruto : R$ " + salarioBruto + " - IR (11%) : R$ " + (0.11 * salarioBruto) + 
				" - INSS (8%) : R$ " + (0.08 * salarioBruto) + " - Sindicato (5%) : R$ " + (0.05 * salarioBruto) +
				" = Salário Liquido : R$ " + salarioLiq);
	
	}
}
