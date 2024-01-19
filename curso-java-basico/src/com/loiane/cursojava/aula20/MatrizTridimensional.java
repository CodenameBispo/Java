package com.loiane.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int [][][] matrizTri = new int [3][3][3];
		int soma = 0;
		
		for(int i =0; i<matrizTri.length; i++) {
			
			for(int j = 0; j <matrizTri[i].length ; j++) {
				
				for(int k = 0; k < matrizTri[i][j].length; k++) {
					
					matrizTri[i][j][k] = i + j + k;
					soma += matrizTri[i][j][k];
				}
			}
			
		}
		System.out.println("Soma Total = " + soma);
	}

}
