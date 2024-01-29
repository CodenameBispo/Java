package com.loiane.cursojava.aula31;

public class Carro {
	
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumo;	

	public String getMarca() {
		return this.marca;
	}
	
	public void  setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void  setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public int getNumPassageiros() {
		return this.numPassageiros;
	}
	
	public void  setNumPassageiros(int numPassageiros){
		this.numPassageiros = numPassageiros;
	}
}
