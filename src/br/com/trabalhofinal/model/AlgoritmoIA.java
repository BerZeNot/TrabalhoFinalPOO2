package br.com.trabalhofinal.model;

import java.util.Random;

import br.com.trabalhofinal.model.Enum.EnumAvaliacao;
import br.com.trabalhofinal.model.Enum.EnumModo;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;
import br.com.trabalhofinal.model.impl.FitterImpl;

public abstract class AlgoritmoIA {
	private Random gerador;
	private EnumTipoTarefa tipoTarefa;
	private Fitter fitter;
	
	protected AlgoritmoIA(EnumTipoTarefa tipoTarefa) {
		this.fitter = new FitterImpl();
		this.gerador = new Random();
		
		this.tipoTarefa = tipoTarefa;
	}
	
	public static void main(String[] args) {
		System.out.println(EnumTipoTarefa.CLASSIFICACAO);
	}
	
	public void fit() {
		System.out.println("Carregando dados...");
		System.out.println("Normalizando dados...");
		System.out.println("Ajustando o modelo de aprendizado...");
		EnumAvaliacao qualidade;
		do {
			System.out.println("---Modelo instatisfatório - " + fitter.getModo());
			qualidade = avaliaModelo();
			fitter.fit(qualidade);
		} while(fitter.getModo().equals(EnumModo.UNFITTED));
		
		if(fitter.getModo().equals(EnumModo.ITERFIT))
			System.out.println("---Modelo regular encontrado! " 
								+ "Qualidade: " + qualidade
								+ "Modo: "    + fitter.getModo());
		
		else if(fitter.getModo().equals(EnumModo.FITTED))
			System.out.println("---Modelo satisfatório encontrado! "
								+ "Qualidade: " + qualidade
								+ "Modo: "      + fitter.getModo());
	}
	
	public Number predict(){
		System.out.println("Recebendo novo dado..");
		System.out.println("Carredando o modelo de aprendizado ajustado anteriormente...");
		System.out.println("Predizendo o valor..");
		if(tipoTarefa.equals(EnumTipoTarefa.CLASSIFICACAO)) {
			return this.gerador.nextInt();
		} 
		// Caso o tipo de tarefa seja Regressão
		else {
			return gerador.nextDouble();
		}
	}
	
	public EnumAvaliacao avaliaModelo() {
		int indexDesempenho = gerador.nextInt(4);
		return EnumAvaliacao.values()[indexDesempenho];
	}
	
	protected abstract void imprimeDadosEspecificos();
	
	public void imprimeModelo() {
		System.out.println("Tipo de tarefa: " + this.tipoTarefa.toString());
		System.out.println("Modo: " + this.fitter.getModo());
		imprimeDadosEspecificos();
	}
}
