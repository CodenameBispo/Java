package com.loiane.cursojava.lab4752;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) throws ContatoNaoExisteException, AgendaCheiaException {
		
		Scanner scan = new Scanner(System.in);		
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[2];
		boolean entradaValida = false;
		int opc = 0;
		System.out.println("Bem vindo a sua agenda!");
		do {
			
			System.out.println("\nO que deseja fazer :");
			System.out.println("1 - Consultar um contato");
			System.out.println("2 - Adicionar um contato");
			System.out.println("3 - Sair");
			opc = 0;
			try {
				 opc = scan.nextInt();
				
				if(opc > 0 && opc < 4 ) {
					entradaValida = true;
					
				} else {
					throw new Exception("Entrada inválida");
				}
			}
			catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}
			
			switch(opc) {
			case 1: 			
				System.out.println("Defina a forma de pesquisa");
				System.out.println("1 - Pelo nome");
				System.out.println("2 - Pelo identificador");
				opc = scan.nextInt();
				
				switch(opc) {
				case 1: System.out.println("Digite o nome");
					scan.nextLine();
					String nome = scan.nextLine();
					agenda.consultarContatoNome(nome);
					break;
					
				case 2: System.out.println("Digite o identificador");
					int id = scan.nextInt();
					agenda.consultarContatoId(id);
					break;
				}
				break;
			case 2:			
				agenda.adicionarContato();
			}
		} while(opc != 3);
		
		
	}
}
