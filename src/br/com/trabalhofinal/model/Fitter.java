package br.com.trabalhofinal.model;

import br.com.trabalhofinal.model.Enum.EnumAvaliacao;
import br.com.trabalhofinal.model.Enum.EnumModo;

public interface Fitter {
	
	public void fit(EnumAvaliacao avaliacao);
	public EnumModo getModo();
}
