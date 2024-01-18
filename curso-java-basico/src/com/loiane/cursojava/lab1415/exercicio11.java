package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu salário:");
		double salario = scan.nextDouble();
		double salarioNovo = salario;
		double percentual = 0;
		if(salario <= 280) {
			
			percentual = 0.2;
			salarioNovo = salario * 0.2 + salario;
			
		} else if (salario <=700) {
			
			percentual = 0.15;
			salarioNovo = salario * 0.15 + salario;
			
		} else if (salario <=1500) {
			
			percentual = 0.10;
			salarioNovo = salario * 0.10 + salario;
			
		} else {
			
			percentual = 0.05;
			salarioNovo = salario * 0.05 + salario;			
		}
		
		System.out.println("Salário Anterior: R$" + salario);
		System.out.println("Percentual de aumento: " + percentual*100 + "%");
		System.out.println("Valor do aumento do salário: R$" + percentual*salario);
		System.out.println("Novo Salário: R$" + salarioNovo);
	
	}
}