package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio23 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] vetor= new int[10];
		boolean todosPares = true;
		
		for(int i=0; i<10 ; i++) {
			
			vetor[i] = random.nextInt(100);
		}
		for(int elemento : vetor) {
			
			if (elemento %2 !=0) {
				todosPares = false;
				break;
			}			
		}
		
		if(todosPares) {
			System.out.println("Todos os elementos são pares");
		} else {
			System.out.println("Pelo menos um elemento não é par. Processo encerrado");
		}
		
		
	}
}
