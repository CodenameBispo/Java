package com.loiane.cursojava.lab4752;

public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		
		return "Agenda já está cheia";
	}
}
