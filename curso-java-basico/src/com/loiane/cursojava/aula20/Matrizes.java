package com.loiane.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double [][] notasAlunos = new double [5] [4];
		
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
		
		for (int i=0; i < notasAlunos.length; i++) {
			
			for(int j=0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média:");
		double soma;
		
		for (int i=0; i < notasAlunos.length; i++) {
			soma=0;
			for(int j=0; j<notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("A média do aluno " + i + " é " + soma/4);
		}
		
		//vetor de vetores
		double[][] notasAlunos2 = {{7,8,9,10}, {6,8,5,4}, {7,8,10,10}, {7,7,6,9}};
		
		System.out.println("Notas alunos 2");
		
		for (int i=0; i < notasAlunos2.length; i++) {
			soma=0;
			for(int j=0; j<notasAlunos2[i].length; j++) {
				soma += notasAlunos2[i][j];
			}
			System.out.println("A média do aluno " + i + " é " + soma/4);
		}
	}

}
