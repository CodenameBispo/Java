package com.loiane.cursojava.lab2527;

public class Aluno {
	
	String nome;
	String sobrenome;	
	String curso;
	String[] disciplinas = new String[3];
	int matricula; 
	double[][] notas = new double[3][4];
	
	
	double verMedia(int disc) {
		double soma =0;
		for(int i=0; i < 3 ; i++) {
			
			soma += notas[disc][i];	
		}
		
		double media = soma/4;
		
		return media;
	}
}
