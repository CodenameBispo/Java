package br.com.dfcodelab.operadores.logicos;

public class OperadoresLogicosTest {

	public static void main(String[] args) {
		
		double rendaMensal = 2000;
		int idade = 27 ;
		boolean temEmprego = true;
		
		// idade >= && idade <= 35;
		// rendaMensal > 2000;
		// temEmprego
		
//		boolean serMaiorOuIgual18EMenorIgual35 = idade >= 18 && idade <= 35;
//		boolean rendaMaiorOuIgual2000 = rendaMensal >= 2000;
//		
//		System.out.println(serMaiorOuIgual18EMenorIgual35);
//		System.out.println(rendaMaiorOuIgual2000);
//		
		if (idade >= 18 && idade <= 35 && rendaMensal >= 2000 && temEmprego) {
			System.out.println("Pode fazer empretimos");
		} else {
			System.out.println("Não pode fazer emprestimo");
		}
		
		String usuario = "san";
		String senha = "12345678";
		
		if(usuario.equals("san") && senha.equals("12345678") || usuario.length() >3) {
			System.out.println("Logar no sistema");
		} else {
			System.out.println("Usuario ou senha invalidos");
		}
		
		
		String texto = "Codar é divertido";
		boolean textoMaiorQue5 = texto.length() > 20 ? true : false;
		System.out.println(textoMaiorQue5);
		
		
	}

}
