package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio19 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite a 1ª nota do aluno " +(i+1));
			nota1[i]=scan.nextInt();			
		}
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println("Digite a 2ª nota do aluno " +(i+1));
			nota2[i]=scan.nextInt();
			result[i]= (nota1[i]+nota2[i])/2;
		}
		
		System.out.println("Aluno | Média | Situação");
		for(int i=0; i<10 ; i++) {
			
			String situacao = (result[i] >= 7) ? "Aprovado" : "Reprovado";
			System.out.println((i+1) + "    " + result[i] + "  " + situacao);			
		}
		
	}
}
