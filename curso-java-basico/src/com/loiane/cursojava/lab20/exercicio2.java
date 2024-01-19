package com.loiane.cursojava.lab20;

import java.util.Random;
import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int x = 10;
		int y = 10;
		int[][] matrizM = new int[x][y];
		
		int maiorL =0;
		int maiorC = 0;
		int menorC = 0;
		
		for(int i=0; i<x ; i++) {
			
			for(int j=0; j<y ; j++ ) {
				
				matrizM[i][j] = random.nextInt(10);
			}
		}
		
		System.out.println("MatrizM[][]: ");
		for(int i=0; i<x ; i++) {
			System.out.print((i+1) +" - {");
			for(int j=0; j<y ; j++ ) {
				
				if(matrizM[4][j] > maiorL) {
					
					maiorL = matrizM[4][j];
				}
				
				if(matrizM[i][6] == 0 || matrizM[i][6]< menorC) {
					menorC = matrizM[i][6];
				} else if (matrizM[i][6]> maiorC) {
					maiorC = matrizM[i][6];
				}
					
				if(j == 9) {
					
					System.out.print(matrizM[i][j] + "}\n");
				} else {
					System.out.print(matrizM[i][j] + ", ");
				}
			}
		}
		System.out.println("\nO maior numero da linha 5 é " + maiorL);
		System.out.println("O menor numero da coluna 7 é " + menorC);
		System.out.println("O maior numero da coluna 7 é " + maiorC);
	}
}
