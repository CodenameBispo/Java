package com.loiane.cursojava.lab20;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int x = 3;
		int y = 3;
		int[][] matrizM = new int[x][y];
		
		int pares =0;
		int impares = 0;
		
		
		for(int i=0; i<x ; i++) {
			
			for(int j=0; j<y ; j++ ) {
				
				System.out.println("Digite o valor da para a posição [" + i + "][" + j + "]");
				matrizM[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("MatrizM[][]: ");
		for(int i=0; i<x ; i++) {
			System.out.print((i+1) +" - {");
			for(int j=0; j<y ; j++ ) {
				
				if(matrizM[i][j]%2 ==0) {
					
					pares++;
				} else {
					impares++;
				}
					
				if(j == y-1) {
					
					System.out.print(matrizM[i][j] + "}\n");
				} else {
					System.out.print(matrizM[i][j] + ", ");
				}
			}
		}
		System.out.println("\nA quantidade de numeros pares é " + pares);
		System.out.println("A quantidade de numeros impares é " + impares);
		
	}
}
