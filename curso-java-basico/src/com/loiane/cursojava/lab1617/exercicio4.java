package com.loiane.cursojava.lab1617;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		
		int popA = 80000;
		int popB = 200000;
		int anos = 0;
		
		do {
			
			popA += popA*0.03;
			popB += popB*0.015;
			anos ++;
			
		} while(popA < popB);
		
		System.out.println("A população A tem " + popA + " habitantes, enquanto a população B tem " + popB + " habitantes");
		System.out.println("A poupalação A demorou " + anos + " anos para ultrapassar a população B");
	}
}