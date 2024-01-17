package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda? ");
		System.out.println("Opções: M- Matutino | V-Vespertino | N-Noturno");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			
			System.out.println("Bom dia !");
			
		} else if (turno.equalsIgnoreCase("V")){
			
			System.out.println("Boa tarde!");
			
		} else if (turno .equalsIgnoreCase("N")) {
			
			System.out.println("Boa noite!");
			
		} else {
			System.out.println("Turno Invalido!");
		}
		
	}
}
