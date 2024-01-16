package br.com.dfcodelab7.operadores.relacionais;

public class OperadoresRelacionaisTest {
	
	public static void main(String[] args) {
		
		// boolean representa verdadeiro ou falso (true ou false) 
		
		// ==, !=, > , < , >= , <=
		
		int saldoBancario = 20000;
		int saque = 1000;
		
		boolean possoSacar =  saldoBancario > saque ;
		System.out.println("Posso fazer saque ? " + possoSacar);
		
		saque = 30000;
		possoSacar = saldoBancario > saque;
		System.out.println("Posso fazer Saque ? " + possoSacar);
		
		saque = 20000;
		possoSacar = saldoBancario == saque;
		System.out.println(" Posso fazer Saque ? " + possoSacar);
		
		saque = 1000;
		possoSacar = saque <= saldoBancario;
		System.out.println("Posso Sacar ? " + possoSacar);
		
		int minhaIdade = 35;
		int minhaMae = 55;
		
		boolean idadeDiferente = minhaIdade != minhaMae;
		System.out.println(idadeDiferente);
		
		Pessoa obj = null;
		boolean objetoNulo = obj !=null;
		System.out.println(objetoNulo); 
	}
}
