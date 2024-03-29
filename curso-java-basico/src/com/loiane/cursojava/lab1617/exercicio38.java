package com.loiane.cursojava.lab1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio38 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.#");
		
		double salarioInicial = 1000;
		double taxaInicial = 1.5;
		double salario = salarioInicial+ salarioInicial*taxaInicial/100;
		int opc = 0;
		int i = 0;
		do {
			
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Exemplo feito");
			System.out.println("2 - Preencha os valores iniciais");
			System.out.println("3 - Sair");
			opc = scan.nextInt();
					
			switch(opc) {
			case 1 : 
				System.out.println("O salário inicial do funcionário era de R$ " + salarioInicial + 
						" no ano de 1996");
				System.out.println("A taxa de aumento no ano de 1996 foi de " + taxaInicial);
				for(i = 1997 ; i<= 2024 ; i++) {
					double taxa = taxaInicial*2/100;
					salario += salario*taxa;
				}
				System.out.println("O salário do funcionário em " + i + " é de R$ " + formato.format(salario));
				
				opc = 0;
				break;
			case 2:
				System.out.println("Qual o salário Inicial?");
				salarioInicial = scan.nextDouble();			
				
				System.out.println("Qual a taxa de aumento de salário?");
				taxaInicial = scan.nextDouble();
				
				System.out.println("Qual o ano de inicio do funcionário?");
				int ano = scan.nextInt();
				
				salario = salarioInicial+ salarioInicial*taxaInicial/100;
				for(i = ano ; i<= 2024 ; i++) {
					double taxa = taxaInicial*2/100;
					salario += salario*taxa;
				}
				System.out.println("O salário do funcionário em " + i + " é de R$ " + formato.format(salario));				
				opc = 0;
				break;
				
			default: System.out.println("Obrigado por utilizar o programa!");
			}
			
		}while(opc != 3);
		
	}
}
