package br.senai.sp.jandira.model;

public class Tabuada {
	
	//Atributos
    public int multiplicando;
    public int minimoMultiplicador;
    public int maximoMultiplicador;
    public String nome;
    
    public 	String[] getTabuada() {
    	
    	int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
    	String tabuada[] = new String[tamanho];
    	
    	int i =0;
    	
    	while (minimoMultiplicador <= maximoMultiplicador) {
    		
    		int produto = multiplicando*minimoMultiplicador;
    		
    		String resultado = multiplicando +"X"+minimoMultiplicador+"="+produto;
    		tabuada[i] = resultado;
    		

    		i++;
    		minimoMultiplicador++;
    	}
    	
    	return tabuada;
    		
     }
    
 }
	

    	


