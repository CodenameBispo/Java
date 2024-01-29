package com.loiane.cursojava.lab2527;

import java.util.Random;
import java.util.Scanner;

public class ContaCorrente {
	
	int agencia;
	int NumeroConta;
	int digito;
	double saldo;
	boolean tipoEspecial;
	double limiteConta;
	
	double fazerSaque(double valorDoSaque) {
		
		if(valorDoSaque > saldo+limiteConta) {
			System.out.println("Não é possível realizar o saque!");
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= valorDoSaque;
			System.out.println("Saque efetuado!");
			
		}
		
		return saldo;
	}
	
	double depositar(double valorDoDeposito) {
		
		saldo += valorDoDeposito;
		
		return saldo;
	}
	
	boolean verificarChequeEspecial() {
		
		if(saldo < 0) {
			return true;
		} else {
			return false;
		}		
	}
	
	
	
}	
