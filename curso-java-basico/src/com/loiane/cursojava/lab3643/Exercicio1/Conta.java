package com.loiane.cursojava.lab3643.Exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Conta {
	
	Scanner scan = new Scanner(System.in);
	private ContaBancaria[] contas = new ContaBancaria[getContador()];
	private static int contador = 0;
	
	
	public int getContador() {
		contador++;
		return contador;
	}
	@Override
	public String toString() {
		return "Conta [contas=" + Arrays.toString(contas) + "]";
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public ContaBancaria[] getContas() {
		return contas;
	}
	public void setContas(ContaBancaria[] contas) {
		this.contas = contas;
	}

	
	
	
	
}
