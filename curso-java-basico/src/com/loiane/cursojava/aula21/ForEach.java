package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		Random random = new Random();
		
		for(int i=0; i<notas.length; i++) {
			
			notas[i]= random.nextInt(10);
		}
		
		for(int i=0; i<notas.length; i++) {
			
			System.out.println(notas[i]);			
		}
		
		System.out.println("Usando o for each");
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		
		//exemplo 2
		System.out.println("Exemplos com arrays multidimensionais");
		double [][] notasAlunos = new double[4][4];
		notasAlunos[0][0] = 5;
		notasAlunos[0][1] = 10;
		notasAlunos[0][2] = 7;
		notasAlunos[0][3] = 8;
		
		notasAlunos[1][0] = 7;
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 8;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 9.5;
		
		notasAlunos[3][0] = 4;
		notasAlunos[3][1] = 7;
		notasAlunos[3][2] = 6.5;
		notasAlunos[3][3] = 6.5;
		
		for (double[] notasAluno : notasAlunos) {
			for(double nota : notasAluno) {
				System.out.print(nota + " ");
				}
			System.out.println();
			}
	}

}
