package com.loiane.cursojava.lab35;

public class Exercicio1e2 {
	
	
	public static int calcularFiboNaacci(int n) {
		int var =-1;
		int fib = 0;
		for(int i=0; i<=n ; i++) {
			
			System.out.println(fib);
			fib += Math.abs(var);
			var = fib - Math.abs(var);
			
			
		}
		return fib;
	}
	
	public static int somarTodos(int n) {
		int total = 0;
		for(int i=1; i<=n; i++) {
			
			total += i;
		}
		
		return total;
	}
}
