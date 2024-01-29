package com.loiane.cursojava.lab3643.Exercicio1;

public class ContaPoupanca extends ContaBancaria{
	
	private double diaRendimento;
	ContaBancaria conta = new ContaBancaria();
	

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo() {
		
		conta.setSaldo(conta.getSaldo()+conta.getSaldo()*diaRendimento);
	}
	
}
