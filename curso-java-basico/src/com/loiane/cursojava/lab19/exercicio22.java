package com.loiane.cursojava.lab19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio22 {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		int[] A= new int[10];
		double contZero = 0;
		double contUm = 0;
		
		
		for(int i=0; i<10 ; i++) {
			
			A[i] = (int)Math.round(Math.random() * 1);
			
			if(A[i] == 0) {
				
				contZero++;
				
			} else {
				
				contUm++;
			}
		}
		
		
		System.out.println("O percentual de 0's é " + (contZero/10*100) + "%");
		System.out.println("O percentual de 1's é " + (contUm/10*100) + "%");
		
		
	}
}
