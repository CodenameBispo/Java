package br.com.dfcodelab7.declaracaocontroleacesso.produto;

import java.math.BigDecimal;

public class Produto {
	
	/* modificador | Tipo | identificador/nome;*/
	
	private String nomeDoProduto; //Apenas dentro da classe
	private BigDecimal valorDoProduto; //por pacote, também via herança
	private String detalhesDoProduto; // all inclusive
	private String marca; //default package-private
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public BigDecimal getValorDoProduto() {
		return valorDoProduto;
	}
	public void setValorDoProduto(BigDecimal valorDoProduto) {
		this.valorDoProduto = valorDoProduto;
	}
	public String getDetalhesDoProduto() {
		return detalhesDoProduto;
	}
	public void setDetalhesDoProduto(String detalhesDoProduto) {
		this.detalhesDoProduto = detalhesDoProduto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
//	private void dadosDoProduto() {
//		this.dadosDoProduto();
//	}
//	
//	public void preencherDadosDoProduto() {
//		
//	}
//	 
//	protected void limparNomeDoProduto() {
//		
//	}
//	
//	void qualEhAMarca() {
//		
//	}
	
}
