package com.loiane.cursojava.lab1415;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scan.nextInt();
		
		if(valor > 0) {
			System.out.println("O valor é positivo.");
		} else if(valor < 0){
			System.out.println("O valor é negativo.");
		}else {
			System.out.println("O valor é 0.");
		}
	}
}
