package br.com.trabalhofinal.model.impl;

import java.util.HashMap;

import br.com.trabalhofinal.model.Fitter;
import br.com.trabalhofinal.model.Enum.EnumModo;

public class FitterRedeNeuralArtificial implements Fitter {
	EnumModo modo;
	boolean primeiraChamada;

	@Override
	public void fit(HashMap<String, String> params) {
		System.out.println("Ajustando modelo da árvore com as configurações: ");
		System.out.println("-- Número de Camadas: " + params.get("numeroDeCamadas"));
		System.out.println("-- Número de Neuronios por Camadas: " + params.get("neuroniosPorCamada"));
		System.out.println("-- Função de Ativação: " + params.get("funcaoDeAtivacao"));
		System.out.println("-- Taxa de aprendizado: " + params.get("funcaoDeAtivacao"));
	}	
	
	@Override
	public EnumModo getModo() {
		return this.modo;
	}



}
