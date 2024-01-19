package com.loiane.cursojava.aula19;

public class Arrays {
	
	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 33.7;
		double tempDia003 = 33.7;
		double tempDia004 = 33.7;
		double tempDia005 = 33.7;
		double tempDia006 = 33.7;
		double tempDia007 = 33.7;
		double tempDia008 = 33.7;
		double tempDia009 = 33.7;
		double tempDia0010 = 33.7;
		
		//substituir por array
		
		double[] temperaturas = new double[365];
		
		temperaturas[0]=31.3;
		temperaturas[1]=32;
		temperaturas[2]=33.7;
		temperaturas[3]=34;
		temperaturas[4]=29.9;
		
		System.out.println(" O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length); // tamanho do array
		
		System.out.println("Valores do Array: " + temperaturas);
		
//		for (int i=0; i<temperaturas.length; i++) {
//			
//			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
//		}
		
		// for melhorado , mostra apenas o valor
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}
}
