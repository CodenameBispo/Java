package com.loiane.cursojava.lab3643.Exercicio1;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	ContaBancaria conta = new ContaBancaria();
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	public void sacar(double valor) {
		
		if(conta.getSaldo()+limite >= valor) {
			conta.setSaldo(conta.getSaldo() - valor);
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Você está usando o cheque especial!");
			
		}	
		
		System.out.println("Saldo insuficiente!");
	}
	
	public static double criarContaEspecial() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual limite deseja ? [0 - 2000]");
		double lmt = scan.nextInt();
		if(lmt > 2000) {
			
			System.out.println("Limite maximo R$ 2000");
			criarContaEspecial();
		} else {
			return lmt;
		}
		return lmt;
	}

	
}
