package br.com.dfcodelab7.operadores.aritimeticos;

public class OperadoresAritimeticosPosPreTest {
	 
	public static void main(String[] args) {
		// ++ pós incremento e pré incremento , -- decrementos
		
		int contador = 10;
		System.out.println("Contador : " + contador++); // contador = 10 incrementa depois de usar o valor atual
		System.out.println("Contador : " + contador++); // contador = 11 incrementa depois de usar o valor atual
		
		System.out.println("Contador : " + ++contador); //incrementa antes de usar o valor atual
		System.out.println("Contador : " + ++contador); //incrementa depois de usar o valor atual
		
		System.out.println("Contador : " + contador--); //decrementa depois de usar o valor atual
		System.out.println("Contador : " + --contador); //decrementa depois de usar o valor atual
	}
}
