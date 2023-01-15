package br.com.trabalhofinal.model.impl;

import br.com.trabalhofinal.model.Fitter;
import br.com.trabalhofinal.model.Enum.EnumAvaliacao;
import br.com.trabalhofinal.model.Enum.EnumModo;

public class FitterImpl implements Fitter{
	EnumModo modo;
	boolean primeiraChamada;
	public FitterImpl() {
		this.primeiraChamada = false;
		this.modo = EnumModo.UNFITTED;
	}
	
	@Override
	public void fit(EnumAvaliacao avaliacao) {
		this.modo = EnumModo.FITTED;
		if(avaliacao.equals(EnumAvaliacao.INSATISFATORIO)) {
			this.modo = EnumModo.UNFITTED;
			return;
		} else if(avaliacao.equals(EnumAvaliacao.REGULAR)) {
			this.modo = EnumModo.ITERFIT;
			return;
		} else {
			this.modo = EnumModo.FITTED;
			return;
		}
	}

	@Override
	public EnumModo getModo() {
		return this.modo;
	}
	
	

}
