package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio21 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do saque ");
		System.out.println("Valores disponíveis: 1 , 5 , 10, 50 e 100");
		System.out.println("Valor mínimo: R$10 máximo: R$600");
		int valor = scan.nextInt();
		int cen = 0;
		int cinq = 0;
		int dez = 0;
		int cin = 0;
		int uni = 0;
		int resto = 0;
		
		if(valor > 10 && valor < 600) {
			
			if(valor % 100 == 0) {
				cen = valor/100;
			} else {				
				cen = valor/100;
				resto = valor%100;			
				cinq = resto/50;
				
				if(resto % 50 != 0 && resto % 50 >= 10) {
					resto %= 50; 
					dez = resto/10;		
					
					if(resto % 10 != 0 && resto % 10 >= 5) {
						resto %= 10;
						cin = resto/5;
						uni = resto%5;
						
					} else {
						uni = dez % 10;						
					}
					
				} else {
					
					uni = resto % 50;					
				}
				
			}					
		}else {
			
			System.out.println("Não é possível fazer o saque.");
		}
		
		System.out.println("O valor solocitado para o saque é R$ " + valor);
		System.out.println("O valor será distribuido em:");
		System.out.println(cen+ " nota(s) de 100");
		System.out.println(cinq+ " nota(s) de 50");
		System.out.println(dez+ " nota(s) de 10");
		System.out.println(cin+ " nota(s) de 5");
		System.out.println(uni+ " nota(s) de 1");
		
		
	}
}