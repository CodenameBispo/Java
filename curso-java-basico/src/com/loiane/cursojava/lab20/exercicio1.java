package com.loiane.cursojava.lab20;

import java.util.Random;
import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[][] matrizM = new int[4][4];
		
		
		for(int i=0; i<4 ; i++) {
			
			for(int j=0; j<4 ; j++ ) {
				
				matrizM[i][j] = random.nextInt(10);
			}
		
			
		}
		System.out.println("MatrizM[][]: ");
		for(int i=0; i<4 ; i++) {
			System.out.print("{");
			for(int j=0; j<4 ; j++ ) {
				
				
				if(j == 3) {
					
					System.out.print(matrizM[i][j] + "}\n");
				} else {
					System.out.print(matrizM[i][j] + ", ");
				}
				
				
			}
		
			
		}
	}
}
