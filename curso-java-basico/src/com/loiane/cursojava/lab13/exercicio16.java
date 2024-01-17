
package com.loiane.cursojava.lab13;

import java.util.Scanner;

public class exercicio16 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos metros quadrados serão pintados ? ");
		int areaPintada = scan.nextInt();
		int litrosTotais = 0;
		// 1 litro cobre 3m²
		// 18 litros R$ 80 		
		
		if (areaPintada % 3 == 0 ) {
			
			 litrosTotais = areaPintada/3;
			
		} else {
			
			 litrosTotais = areaPintada / 3 + 1;
		}
		
		System.out.println("O cliente vai precisar de " + litrosTotais + " litros de tinta");
		
		int preco= 80;		
		int nlatas = litrosTotais/18;
		
		if (litrosTotais % 18 == 0 ) {
			
			nlatas = litrosTotais/18;
			
		} else if( nlatas < 1 ) {
			
			nlatas = 1;
			
		} else {
			
			nlatas = litrosTotais/18 + 1 ;
		}
		
		System.out.println("O cliente precisará de " + nlatas + " lata(s) !");
		System.out.println("O preço total será de R$ " + preco*nlatas );
		
		
		
	}
}
