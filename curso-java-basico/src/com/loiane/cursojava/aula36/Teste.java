package com.loiane.cursojava.aula36;

public class Teste {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Burgs");
		
		
		//criar o objeto endereço
		
		Endereco end = new Endereco();
		end.setNomeRua("Travessa do tranco");
		end.setNumero("n/a");
		end.setCidade("Hogsmead");
		end.setEstado("London");
		end.setCep("8498514");
		end.setPais("Irlanda");
		
		contato.setEndereco(end);
		
		//relacionamento tem um telefone
		Telefone tel1 = new Telefone();
		tel1.setTipo("Celular");
		tel1.setDdd("41");
		tel1.setNumero("998484808");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Residêncial");
		tel2.setDdd("41");
		tel2.setNumero("34731588");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel1;
		telefones[1] = tel2;
		
		contato.setTelefones(telefones); // sempre lembrar de setar
		
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco().getCidade());
		//não é seguro pois pode dar erro
		
		if(contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
//		if(contato.getTelefone() != null) {
//			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
//		}
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+ " " + t.getNumero());
			}
			
		}
	}
}
