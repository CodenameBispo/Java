package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio12 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de sua hora trabalhada");
		double valorHora = scan.nextDouble();
		System.out.println("Digite quantas horas por semana você trabalha");
		int horasSemana = scan.nextInt();
		double salario = horasSemana*4*valorHora;
		double ir = 0;
		double tributo = 0;
		
		if(salario <= 900) {		
			
		} else if (salario <=1500) {
			
			tributo = 0.05;
			ir = salario * 0.05;
			
		} else if (salario <=2500) {
			
			tributo = 0.10;
			ir = salario * 0.10;
			
		} else {
			
			tributo = 0.20;
			ir = salario * 0.20;	
		}
		
		double totalDescontos =  ir + 0.10*salario + 0.03*salario;
				
		System.out.println("Salário Bruto: (" + valorHora + " * " + horasSemana*4 + ")					: R$" + salario);
		System.out.println("(-) IR (" + tributo*100 + "%)							: R$" + ir);
		System.out.println("(-) INSS (10%)							: R$" + 0.10*salario);
		System.out.println("(-) Sindicato (3%)						: R$" + 0.03*salario);
		System.out.println("FGTS (11%)							: R$" + salario*0.11);
		System.out.println("Total de descontos						: R$" + totalDescontos);
		System.out.println("Salário Liquido							: R$" + (salario - totalDescontos));
	}
}