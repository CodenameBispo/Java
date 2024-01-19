package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio36 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja ver a tabuada");
		int num = scan.nextInt();
		System.out.println("A tabuada começa com qual numero e vai até qual numero?");
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		System.out.println("Tabuada do " + num + " começando em " + start + " e terminando em " + 7 + ":");
		for(int i = start ; i<=end ; i++) {
			
			System.out.println(num + " * " + i + " = " + num*i);
		}		
		
		
	}
}
