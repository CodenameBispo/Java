package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		do {
			
			System.out.println("Digite o seu usuario");
			String user = scan.next();
			System.out.println("Digite a sua senha");
			String pass = scan.next();
			
			if(user.equals(pass)) {
				
				System.out.println("Erro: A senha não pode ser igual ao usuario \n");
				i = 1;
			} else {
				
				System.out.println("Usuario " + user + " cadastrado com sucesso!");
				i=0;
			}
		} while(i > 0);
	}
}
