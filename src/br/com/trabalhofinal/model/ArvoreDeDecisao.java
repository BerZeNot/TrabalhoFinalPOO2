package br.com.trabalhofinal.model;

import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;

public class ArvoreDeDecisao extends AlgoritmoIA{
	
	private int numeroDeArvores;
	private double medidaDeInformacao;
	
	public ArvoreDeDecisao(EnumTipoTarefa tipoTarefa, int numeroDeArvores, double medidaDeInformacao) {
		super(tipoTarefa);
		this.numeroDeArvores = numeroDeArvores;
		this.medidaDeInformacao = medidaDeInformacao;
	}




	@Override
	protected void imprimeDadosEspecificos() {
		System.out.println("Número de árvores: " + this.numeroDeArvores);
		System.out.println("Medida de informação: " + this.medidaDeInformacao);
		System.out.println("Algoritmo: Árvore de Decisão");
	}

}
