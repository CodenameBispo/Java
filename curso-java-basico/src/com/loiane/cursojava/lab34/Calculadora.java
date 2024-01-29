package com.loiane.cursojava.lab34;

public class Calculadora {
	
	
	public static int somar(int num1 , int num2) {
		
		return num1 + num2;	
	}
	
	public static int subtrair(int num1 , int num2) {
		
		return num1 - num2;	
	}
	
	public static double dividir(double num1 , double num2) {
		
		return num1 / num2;	
	}
	
	public static int multiplicar(int num1 , int num2) {
		
		return num1 * num2;	
	}
	
	public static double elevar(double num1 , double num2) {
		
		return Math.pow(num1, num2);	
	}
	
	public static int fatorial(int num) {
		
		int total = num;
		for(int i=num; i > 1; i--) {
			if(num == 0) {
				return 1;
			}
			total *= i-1;
			
		}	
		return total;
		
	}
}
