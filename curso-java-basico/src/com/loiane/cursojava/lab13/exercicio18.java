package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo para download:");
		double size = scan.nextDouble();
		System.out.println("Qual a velocidade de download? ");
		double vel = scan.nextDouble();
		double velB = vel / 8;
		double tempo = (size/velB)/ 60;
		
		System.out.println("O tempo estimado é de " + tempo + " minutos");
	}

}
