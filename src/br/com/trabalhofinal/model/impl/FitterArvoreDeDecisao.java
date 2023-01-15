package br.com.trabalhofinal.model.impl;

import java.util.HashMap;

import br.com.trabalhofinal.model.Fitter;
import br.com.trabalhofinal.model.Enum.EnumModo;

public class FitterArvoreDeDecisao implements Fitter {
	EnumModo modo;
	boolean primeiraChamada;
	
	
	@Override
	public EnumModo getModo() {
		return this.modo;
	}


	@Override
	public void fit(HashMap<String, String> params) {
		System.out.println("Ajustando modelo da árvod com as configurações: ");
		System.out.println("-- Número de Árvores: " + params.get("numeroDeArvores")); 
		System.out.println("-- Medida de Informação: " + params.get("medidaDeInformacao"));
	}

}
