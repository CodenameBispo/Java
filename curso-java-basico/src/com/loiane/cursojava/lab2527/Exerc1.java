package com.loiane.cursojava.lab2527;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		lampada.comodo = "Quarto";
		lampada.corDaLuz = "Bright White";
		lampada.potencia = 9;
		lampada.tipo = "Led";
		lampada.formato = "A60";
		
		String status = (lampada.estaLigada) ? "ligada" : "desligada";
		System.out.println("A lampada do " + lampada.comodo + " está " + status);
		String cond = (status.equalsIgnoreCase("ligada")) ? "desligar" : "ligar";
		System.out.println("Deseja " + cond + " ?");
		String resp = scan.next();
		
		if(status.equalsIgnoreCase("ligada") && resp.equalsIgnoreCase("Sim")) {
			lampada.desligarLampada();
		} else if(status.equalsIgnoreCase("desligada") && resp.equalsIgnoreCase("Sim")) {
			lampada.ligarLampada();
		}
		status = (lampada.estaLigada) ? "ligada" : "desligada"; // isso pode virar um método ?
		System.out.println("A lampada do " + lampada.comodo + " agora está " + status);
	}

}
