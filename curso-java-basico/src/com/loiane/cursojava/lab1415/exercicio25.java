package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio25 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cont =0;
		System.out.println("Responda com sim ou não");
		System.out.println("Telefonou para a vítima?");
		String tel = scan.next();
		if (tel.equalsIgnoreCase("sim")) {
			cont++;
		}
		System.out.println("Esteve no local do crime?");
		String local = scan.next();
		if (local.equalsIgnoreCase("sim")) {
			cont++;
		}
		System.out.println("mora perto da vítima?");
		String mora = scan.next();
		if (mora.equalsIgnoreCase("sim")) {
			cont++;
		}
		System.out.println("Devia para a vítima?");
		String devia = scan.next();
		if (devia.equalsIgnoreCase("sim")) {
			cont++;
		}
		System.out.println("Já Trabalhou com a vítima?");
		String trab = scan.next();
		if (trab.equalsIgnoreCase("sim")) {
			cont++;
		}
		
		if(cont == 2) {
			
			System.out.println("Suspeita");
			
		} else if(cont < 5){
			
			System.out.println(" Cúmplice");
			
		} else if(cont == 5) {
			
			System.out.println("Assassino");
			
		} else {
			
			System.out.println("Inocente");			
		}
	}
}