package br.com.dfcodelab7.operadores.aritimeticos;

public class OperadoresAritimeticosTest {
	
	public static void main(String[] args) {
		
		// +, - , * , / , %
		
		// ++ , --
		
		int salario = 15000;
		int horaExtra = 1000;
		
		int salarioBruto = salario + horaExtra;
		
		System.out.println("Salário Bruto: " + salarioBruto);
		
		int desconto = 500;
		
		int salarioLiquido = salarioBruto - desconto;
		
		System.out.println("Salário Liquido: " + salarioLiquido);
		System.out.println("Salário Liquido: " + (salarioBruto - desconto));
		
		int numeroA = 25;
		int numeroB = 50;
		
		int resultado = numeroA * numeroB;
		System.out.println("O Resultado de A * B é = " + resultado);
		
		int numeroQualquer = 2800 /2 ;
		System.out.println("O resultado qualquer: " + numeroQualquer);
		
		int numero = 100;
		int resto = numero % 2;
		
		System.out.println("O resto da divisão é: " + resto);
		
		String nome = "Lucas";
		String sobrenome = "Bispo";
		
		System.out.println(nome + " " +sobrenome);
		System.out.println(10 + 20 + " é igual a 30" );
		System.out.println(" O valor é igual a 30 " +(10 + 20));
	}
}
