package com.loiane.cursojava.lab34;

public class Contador {
	
	static int cont;	
	
	public static void zerar() {
		cont =0;
	}
	
	public static void incrementar() {
		cont++;
	}
	
	public static int retornar() {
		return cont;
	}
}