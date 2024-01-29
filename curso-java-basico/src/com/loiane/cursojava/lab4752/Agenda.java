package com.loiane.cursojava.lab4752;

import java.util.Scanner;

public class Agenda {

	Scanner scan = new Scanner(System.in);
	Contato[] contatos;
	Contato contato;
	
	public Agenda() {
		contatos = new Contato[5];
	}
	
	public Contato[] adicionarContato() throws AgendaCheiaException{
		Scanner scan = new Scanner(System.in);
		boolean cheia = false;
		
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i] != null) {				
				cheia = true;
			} else {
				cheia = false;
			}
		}
		
		if (cheia) {
			throw new AgendaCheiaException();
		}
		
		System.out.println("Digite o nome do contato");
		String nome = scan.nextLine();

		System.out.println("Digite o telefone com o DDD");
		String tel = scan.next();
		
		int posicaoVazia = -1;
		  for (int i = 0; i < contatos.length; i++) {
		     if (contatos[i] == null) {
		      posicaoVazia = i;
		      break;
		     }
		}
		  
		if (posicaoVazia != -1) {
		   contatos[posicaoVazia] = new Contato(); // Crie uma instância de Contato aqui
		   contatos[posicaoVazia].setNome(nome);
		   contatos[posicaoVazia].setTelefone(tel);
		   contatos[posicaoVazia].getIdentificador();
		}

//		contatos[0].setNome(nome);
//		contatos[0].setTelefone(tel);
//		contatos[0].getIdentificador();
		return contatos;
		
	}

	public void consultarContatoNome(String nome) throws ContatoNaoExisteException{
		boolean sim = false;
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getNome().equalsIgnoreCase(nome)) {
					System.out.println(contatos[i]);
					sim = true;
					break;
				}
			}
		}
		if(sim = false) {
			throw new ContatoNaoExisteException(nome);
		}
		
	}
	
	public void consultarContatoId(int id) throws ContatoNaoExisteException {
		boolean sim = false;
		
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getIdentificador() == id) {
					System.out.println(contatos[i]);
					sim = true;
					break;
				}
			}
		}
		if(sim = false) {
			throw new ContatoNaoExisteException(id);
		}
	}
}
