package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia");
		int dia = scan.nextInt();
		
		System.out.println("Digite o mês");
		int mes = scan.nextInt();
		
		System.out.println("Digite o ano");
		int ano = scan.nextInt();
		
		boolean anoBis = false;
		
		if (dia >0 && mes > 0) {
			
			if (ano % 100 == 0 ) {
				
				if(ano % 400 == 0) {				
					anoBis = true;
				} 
				
			} else if(ano % 4 == 0){
				
				anoBis = true;			
			} 
		} else {
			
			System.out.println("Data invalida");
		}
		
		if (anoBis) {			
			
			if(mes == 2 ) {
				
				if(dia <=29){
					
					System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida");
					
				} else {
					
					System.out.println("Data invalida");
				}
				
			} else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
				
				
				if(dia <=30){
					
					System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida");
					
				} else {
					
					System.out.println("Data invalida");
				}
				
			} else {
				
				if(dia <=31){
					
					System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida");
					
				} else {
					
					System.out.println("Data invalida");
				}
			}
			
			
		} else{

			if(mes == 2 ) {
				
				if(dia <=28){
					
					System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida");
					
				} else {
					
					System.out.println("Data invalida");
				}
				
			} else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
				
				
				if(dia <=30){
					
					System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida");
					
				} else {
					
					System.out.println("Data invalida");
				}
				
			} else {
				
				if(dia <=31){
					
					System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida");
					
				} else {
					
					System.out.println("Data invalida");
				}
			}
		}
		
		
	}
}
