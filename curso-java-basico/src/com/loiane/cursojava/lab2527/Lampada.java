package com.loiane.cursojava.lab2527;

import java.util.Random;
import java.util.Scanner;

public class Lampada {
	
	String comodo;
	int potencia;
	double preco;
	String tipo;
	String corDaLuz;
	String formato;
	
	boolean estaLigada;
	
	boolean ligarLampada() {
		estaLigada = true;
		return estaLigada;
	}
	
	boolean desligarLampada() {
		estaLigada = false;
		return estaLigada;
	}
}	
