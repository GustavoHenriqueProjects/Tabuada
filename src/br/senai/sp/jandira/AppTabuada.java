package br.senai.sp.jandira;

import br.senai.sp.jandira.model.ClienteTabuada;

public class AppTabuada {
	public static void main(String[] args) {
		
	ClienteTabuada tabuada = new ClienteTabuada();
	tabuada.multiplicando = 2;
	tabuada.minimoMultiplicador = 17;
	tabuada.maximoMultiplicador= 20;
	
	String[] resultado = tabuada.getTabuada();
	
	System.out.println(resultado[0]);
 	
	
	}	
}
