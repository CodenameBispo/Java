package com.loiane.cursojava.lab36;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		Professor professor = new Professor();
		Curso curso = new Curso();
		Aluno aluno = new Aluno();		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		//atribuindo valores para o obj aluno
		double[] notas = new double[4];
		notas[0]= 10;
		notas[1] = 10;
		notas[2] = 10;
		notas[3] = 10;
		aluno.setNotas(notas);
		aluno.setNome("Joao");
		aluno.setMatricula("1");
		
		double[] notas1 = new double[4];
		notas1[0]= 10;
		notas1[1] = 10;
		notas1[2] = 10;
		notas1[3] = 10;
		aluno1.setNotas(notas1);
		aluno1.setNome("Pedro");
		aluno1.setMatricula("2");
		
		double[] notas2 = new double[4];
		notas2[0]= 10;
		notas2[1] = 10;
		notas2[2] = 10;
		notas2[3] = 10;
		aluno2.setNotas(notas2);
		aluno2.setNome("Beatriz");
		aluno2.setMatricula("3");
		
		double[] notas3 = new double[4];
		notas3[0]= 10;
		notas3[1] = 10;
		notas3[2] = 10;
		notas3[3] = 10;
		aluno3.setNotas(notas3);
		aluno3.setNome("Anelise");
		aluno3.setMatricula("4");
		
		double[] notas4 = new double[4];
		notas4[0]= 10;
		notas4[1] = 10;
		notas4[2] = 10;
		notas4[3] = 10;
		aluno4.setNotas(notas4);
		aluno4.setNome("Wagner");
		aluno4.setMatricula("5");
		
		//criando um vetor de obj(Alunos)
		Aluno[] alunos = new Aluno[5];
		alunos[0]= aluno;
		alunos[1]= aluno1;
		alunos[2]= aluno2;
		alunos[3]= aluno3;
		alunos[4]= aluno4;
				
		curso.setNomeCurso("Combate");	
		curso.setAlunos(alunos);
		
		
		System.out.println(curso);


		
	}
}	
