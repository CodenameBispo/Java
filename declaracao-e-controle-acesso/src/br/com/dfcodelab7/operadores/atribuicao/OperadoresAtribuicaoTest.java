package br.com.dfcodelab7.operadores.atribuicao;

public class OperadoresAtribuicaoTest {
	
	public static void main(String[] args) {
		// =, +=, -= , *= , /= , %= -> Atribuição Abreviados/Compostos
		
		int resultado = 10 + 20;
		System.out.println(resultado);
		
		int numeroA = 100;			
		//numeroA = numeroA + 200;
		numeroA += 200;
		System.out.println("O valor do numero A é " + numeroA);
		
		int numeroB = 500;
//		NUMEROB = NUMEROB - 250;	
		numeroB -= 250;
		System.out.println(" O valor do numero B é " + numeroB);
		
		int numeroC = 500;
//		numeroC = numeroC*100;	
		numeroC *=100;	
		System.out.println(" O valor do numero C é " + numeroC);
		
		int numeroD = 1000;
//		numeroD = numeroD / 250;
		numeroD /= 250;	
		System.out.println(" O valor do numero D é " + numeroD);
		
		int numeroE = 10555;
		numeroE %= 5;
		System.out.println("O valor do resto do número E é " + numeroE);
		
	}
}
