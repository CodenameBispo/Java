package br.com.dfcodelab7.declaracaocontroleacesso.vendas;

import java.math.BigDecimal;

public class PontoDeVenda {
	
	/*Identificadores não permitidos
	 * 
	 * String @email; !email; ... 
	 * Paralavras chaves, ex: class ou final
	 */
	// Exemplos identificador válidos:
	String _valorUnitario;
	BigDecimal $valorTotal;
	String email_178;
	String _178;
	
	String nomeDoPontoDeVenda; //identificador
	
	static final int QNT_DIAS_VENCIMENTO = 10; //Constante 
	
	//Métodos exemplos:
	public void salvarPontoDeVenda() {
		
	}
	
	public void excluirPontoDeVenda() {
		
	}
}
