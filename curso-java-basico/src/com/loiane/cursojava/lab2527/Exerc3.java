package com.loiane.cursojava.lab2527;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int disc = -1;
		int inf = 4;
		int sup = 10;
		Aluno aluno = new Aluno();
		aluno.matricula = 001;
		aluno.nome = "Lucas";
		aluno.sobrenome = "Bispo" ;
		aluno.curso = "Análise e desenvolvimento de sistemas";
		aluno.disciplinas[0] = "Desenvolvimento Web";
		aluno.disciplinas[1] = "Orientação A Objetos";
		aluno.disciplinas[2] = "Projetos";
		
		for(int i=0; i < 3 ; i++) {
			for(int j=0; j < 4 ; j++) {
				aluno.notas[i][j] = inf + (sup - inf) * random.nextDouble();
				System.out.println(formato.format(aluno.notas[i][j]));
			}
		}
		
		do {
			System.out.println("Digite a matricula do aluno");
			int matricula = scan.nextInt();
			
			if(matricula == aluno.matricula) {
				System.out.println("Aluno: " + aluno.nome + " " + aluno.sobrenome);
				
				System.out.println("Matérias matriculadas");				
				for(int i=0 ; i <3 ; i++) {
					System.out.println(aluno.disciplinas[i]);
				}
				System.out.println("\n Qual matéria deseja saber a situação?");
				System.out.println("1 - Desenvolvimento Web");
				System.out.println("2 - Orientação a objetos");
				System.out.println("3 - Projetos");
				int materia = scan.nextInt();			
				disc = materia-1;
				
				double media = aluno.verMedia(disc);
				
				if(media >= 7) {
					System.out.println("Aprovado em " + aluno.disciplinas[materia-1]);
					System.out.println();
				} else {
					System.out.println("Reprovado em " + aluno.disciplinas[materia-1]);
					System.out.println();
				}
				
			} else {
				System.out.println("Aluno não matriculado");
			}
		} while(disc < 1);
	}

}
