package br.com.trabalhofinal.model;

import br.com.trabalhofinal.model.Enum.EnumFuncaoDeAtivacao;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;

public class RedeNeuralArtificial extends AlgoritmoIA {
	
	private int numeroDeCamadas;
	private int neuroniosPorCamada;
	private EnumFuncaoDeAtivacao funcaoDeAtivacao;
	private double taxaDeAprendizado;
	
	public RedeNeuralArtificial(EnumTipoTarefa tipoTarefa, int numeroDeCamadas, int neuroniosPorCamada,
			EnumFuncaoDeAtivacao funcaoDeAtivacao, double taxaDeAprendizado) {
		super(tipoTarefa);
		this.numeroDeCamadas = numeroDeCamadas;
		this.neuroniosPorCamada = neuroniosPorCamada;
		this.funcaoDeAtivacao = funcaoDeAtivacao;
		this.taxaDeAprendizado = taxaDeAprendizado;
	}

	@Override
	protected void imprimeDadosEspecificos() {
		System.out.println("Número de Camadas: " + numeroDeCamadas);
		System.out.println("Número de Neurônios por Camada: " + neuroniosPorCamada);
		System.out.println("Função de Ativação: " + funcaoDeAtivacao);
		System.out.println("Taxa de Aprendizado: " + taxaDeAprendizado);
		
	}

}
