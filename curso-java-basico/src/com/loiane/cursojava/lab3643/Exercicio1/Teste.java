package com.loiane.cursojava.lab3643.Exercicio1;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		ContaBancaria conta = new ContaBancaria();
		int opc =0;
		
		do {
			
			System.out.println("Bem vindo ao Agroti$");
			System.out.println("O que deseja fazer?");
			System.out.println("1- Criar Contas");
			System.out.println("2- Sacar");
			System.out.println("3- Depositar");
			System.out.println("4- Calcular rendimento");
			System.out.println("5- mostrar dados da conta");
			System.out.println("6 -Sair");
			opc = scan.nextInt();
			
			switch(opc) {
			
			case 1: conta.criarConta();
//			System.out.println(conta);
			}
		}while(opc != 6);
	}
}
