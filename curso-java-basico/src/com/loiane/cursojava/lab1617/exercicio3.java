package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		int sal = 0;
		String sexo = "";
		String estado = "";
;		int i = 0;
		
		for(i=1 ; i<6 ; i++) {
			
			if(i == 1) {
				System.out.println("Digite o seu nome");
				 nome = scan.next();
				if(nome.length() < 3) {
					
					System.out.println("Erro: Nome precisa ter mais que 3 caracteres \n");
					i=0;
				}
			}
			
			if( i == 2) {
				
				System.out.println("Digite sua idade");
				idade = scan.nextInt();
				if(idade <= 0 || idade >= 150) {
					
					System.out.println("Erro: Nome precisa ter mais que 3 caracteres \n");
					i = 1;
				}
			}
			
			if ( i == 3) {
				
				System.out.println("Digite o seu sexo: F ou M");
				sexo = scan.next();
				if(sexo.equalsIgnoreCase("m")) {
					
					sexo = "Masculino";
					
				} else if (sexo.equalsIgnoreCase("f")){
					
					sexo = "Feminino";
					
				} else {
					
					System.out.println("Erro: Sexo inválido");
					i=2;
				}
			}
			
			if ( i == 4) {
				
				System.out.println("Digite seu salário");
				sal = scan.nextInt();
				if(sal<0) {
					
					System.out.println("Erro: Salário precisa ser maior que 0");
					i=3;					
				} 
			}
			
			if ( i == 5) {
				
				System.out.println("Digite o seu estado civil : S - Solteiro, C - Casado , V - Viuvo ou D - Divorciado");
				estado = scan.next();
				if(estado.equalsIgnoreCase("s")) {
					
					estado = "Solteiro";
					
				} else if (estado.equalsIgnoreCase("c")){
					
					estado = "Casado";
					
				} else if (estado.equalsIgnoreCase("v")){
					
					estado = "Viuvo";
					
				} else if (estado.equalsIgnoreCase("d")){
					
					estado = "Divorciado";
					
				} else {
					System.out.println("Erro: Estado Civil Inválido");
					i=4;
				}
			}	

		}//for
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$" + sal);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estado);
	}

	int anos = 0;
}
