package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio12 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja ver a tabuada");
		int num = scan.nextInt();
		System.out.println(" - Tabuada do " + num);
		for(int i =1; i<=10 ; i++) {
			
			int var = num * i;
			System.out.println(num + " * " + i + " = " + var);
		}		
		
		
	}
}
