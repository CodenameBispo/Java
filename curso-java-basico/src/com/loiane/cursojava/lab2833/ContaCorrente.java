package com.loiane.cursojava.lab2833;

public class ContaCorrente {
	
	private int agencia;
	private int digito;
	private int NumeroConta;
	private double saldo;
	private boolean tipoEspecial;
	private double limiteConta;	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public int getNumeroConta() {
		return NumeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		NumeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isTipoEspecial() {
		return tipoEspecial;
	}

	public void setTipoEspecial(boolean tipoEspecial) {
		this.tipoEspecial = tipoEspecial;
	}

	public double getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}

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
