package com.loiane.cursojava.lab3643.Exercicio1;

import java.util.Scanner;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numConta; 
	private double saldo;
	private String tipoConta;	
	
	
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(saldo - valor > 0) {
			System.out.println("Saldo insuficiente!");
			
		}		
		saldo -= saldo;
		System.out.println("Saque efetuado com sucesso!");
		
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void criarConta() {
		ContaBancaria novaConta = new ContaBancaria();		
		ContaBancaria[] novasContas;
		ContaEspecial especial = new ContaEspecial();
		Conta conta = new Conta();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o tipo de conta?");
		System.out.println("1 - Normal , 2 - Especial , 3- Poupança");
		int escolha = scan.nextInt();
		
		System.out.println("Qual o nome do titular da conta");
		scan.nextLine();
		String nome = scan.nextLine();	
		
		switch(escolha) {
		case 1 :
				novaConta.setNomeCliente(nome);
				novaConta.setNumConta(conta.getContador());
				novaConta.setTipoConta("Simples");
				novaConta.setSaldo(0);
				
				novasContas = new ContaBancaria [conta.getContador()] ;
				novasContas[conta.getContador()] = novaConta;
				conta.setContas(novasContas);
				System.out.println(conta);
				break;
		case 2 :
				novaConta.setNomeCliente(nome);
				novaConta.setNumConta(conta.getContador());
				novaConta.setTipoConta("Especial");
				novaConta.setSaldo(0);
				
//				novaConta.setNumConta(especial.criarContaEspecial());
				novasContas = new ContaBancaria [conta.getContador()] ;
				novasContas[conta.getContador()] = novaConta;
				conta.setContas(novasContas);
				break;
		case 3: 
				novaConta.setNomeCliente(nome);
				novaConta.setNumConta(conta.getContador());
				novaConta.setTipoConta("Especial");
				novaConta.setSaldo(0);
				
				novasContas = new ContaBancaria [conta.getContador()] ;
				novasContas[conta.getContador()] = novaConta;
				conta.setContas(novasContas);
				break;
		}
		
	}
	public String toString() {
		ContaEspecial especial = new ContaEspecial();
		
		String s = "Nome do Cliente: " + nomeCliente + "\n";
		s+= "Numero da conta: " + numConta + "\n";
		s+= "saldo: " + saldo + "\n";
		s+= "Tipo da conta: " + tipoConta + "\n";
		if(tipoConta.equalsIgnoreCase("especial")) {
			s+= "Limite da conta: " + especial.getLimite()+ "\n\n";
		}			
		return  s;		
	}
}
