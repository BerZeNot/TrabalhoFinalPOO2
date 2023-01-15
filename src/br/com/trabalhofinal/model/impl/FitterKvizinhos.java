package br.com.trabalhofinal.model.impl;

import java.util.HashMap;

import br.com.trabalhofinal.model.Fitter;
import br.com.trabalhofinal.model.Enum.EnumModo;

public class FitterKvizinhos implements Fitter{
	EnumModo modo;
	boolean primeiraChamada;
	
	public FitterKvizinhos() {
		this.primeiraChamada = false;
		this.modo = EnumModo.UNFITTED;
	}
	
	@Override
	public void fit(HashMap<String, String> params) {
		System.out.println("Ajustando modelo da árvore com as configurações: ");
		System.out.println("-- Número de Árvores: " + params.get("numeroDeArvores")); 
		System.out.println("-- Medida de Informação: " + params.get("medidaDeInformacao"));
	}

	@Override
	public EnumModo getModo() {
		return this.modo;
	}

	
	
	
	
	

}
