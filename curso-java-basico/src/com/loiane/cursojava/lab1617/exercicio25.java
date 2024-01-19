package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio25 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Qual o tamanho da turma?");
		int n = scan.nextInt();		
		int i = 0;
		int soma = 0;
		int media = 0;
		for (i = 0 ; i < n ; i++) {
			
			System.out.println("Digite a idade da " + (i+1) + "ª pessoa");
			soma += scan.nextDouble();
			
		}
		
		media = Math.ceilDiv(soma, i);
		
		if(media>0 && media <= 25) {
			System.out.println("A turma é jovem ");
		} else if(media > 60) {
			System.out.println("A turma é idosa ");
		}
		
		System.out.println("A turma é adulta ");

	}
}
