package com.loiane.cursojava.lab2833;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		int menu = 0;
		
		ContaCorrente conta = new ContaCorrente();
		
		 conta.setAgencia(2157);
		 conta.setNumeroConta(21007);
		 conta.setDigito(2);
		 conta.setSaldo(80.75);
		 conta.setLimiteConta(900);
		 conta.setTipoEspecial(false);
				 
		 do {
			 System.out.println("Selecione a operação: ");
			 System.out.println("1 - Saldo");
			 System.out.println("2 - Deposito");
			 System.out.println("3 - Saque");
			 System.out.println("4 - Sair");
			 menu = scan.nextInt();
			 
			 switch(menu) {
			 case 1 : 
				 if(conta.verificarChequeEspecial()) {
					 System.out.println("Você está utilizando seu cheque especial");
					 System.out.println("O saldo da sua conta é R$ " + formato.format(conta.getSaldo()));
				 } else {
					 System.out.println("O saldo da sua conta é R$ " + formato.format(conta.getSaldo()));
				 }
				 break;
			 case 2 :
				 System.out.println("Digite o valor a ser depositado");
				 double valorDoDeposito = scan.nextDouble();
				 System.out.println("O valor do deposito é " + valorDoDeposito);
				 System.out.println("Confirma ? Sim ou Não?");				 
				 if(scan.next().equalsIgnoreCase("Sim")) {
					 
					 conta.depositar(valorDoDeposito);
					 System.out.println("O seu novo saldo é: " + formato.format(conta.getSaldo()));
				 } else {
					 menu=0;
				 }
				 break;
				 
			 case 3: 
				 System.out.println("Qual valor deseja sacar?");
				 double valorDoSaque = scan.nextDouble();
				 double saldoAntes = conta.getSaldo();
				 conta.fazerSaque(valorDoSaque);
				 if(saldoAntes == conta.getSaldo()) {
					 menu = 0 ;
				 } else {
					 System.out.println("Seu novo saldo é R$ " + formato.format(conta.getSaldo()));
				 }
				 
				 break;
				 
			 case 4 :
				 System.out.println("Obrigado por utilizar!");
				 break;
			 }
			 
			 System.out.println();
		 } while (menu != 4);
	}

}
