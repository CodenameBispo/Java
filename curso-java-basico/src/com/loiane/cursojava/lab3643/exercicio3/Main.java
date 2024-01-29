package com.loiane.cursojava.lab3643.exercicio3;

public class Main {

	public static void main(String[] args) {
		
		Animal camelo = new Animal("Camelo", 150, "Amarelo", "Terra", 2.0);
		System.out.println("--------------");
		System.out.println(camelo);
		System.out.println("--------------");
		
		Peixe tubarao = new Peixe("Barbatanas e cauda");
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);	
		tubarao.setVelocidade(1.5);
		System.out.println(tubarao);
		System.out.println("--------------");
		Urso urso = new Urso();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setCor("Vermelha");
		urso.setVelocidade(0.5);

		System.out.println(urso);
		System.out.println("--------------");		
		
		
	}
}