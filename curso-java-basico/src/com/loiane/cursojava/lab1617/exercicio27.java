package com.loiane.cursojava.lab1617;

import java.util.Scanner;

public class exercicio27 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas turmas possuem?");
		int t = scan.nextInt();
		
		int n =0 ; 				
		int media = 0;
		for (int i = 0 ; i < t ; i++) {
			
			System.out.println("Digite a quantidade de alunos da turma  " + (i+1));
			
			if(scan.nextInt() > 40) {
				System.out.println("Turma não pode ter mais que 40 aluno");
				i=0;
			}
			n += scan.nextInt();		
			
			
			
		}
		
		media = Math.ceilDiv(n, t);
		
		if(media>0 && media <= 25) {
			System.out.println("A turma é jovem ");
		} else if(media > 60) {
			System.out.println("A turma é idosa ");
		}
		
		System.out.println("A turma é adulta ");

	}
}
