package br.com.trabalhofinal.model;

import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;

public class KVizinhos extends AlgoritmoIA {
	private int numeroDeVizinhos;
	private int medidaDeProximidade;
	
	public KVizinhos(EnumTipoTarefa tipoTarefa, int numeroDeVizinhos, int medidaDeProximidade) {
		super(tipoTarefa);
		this.numeroDeVizinhos = numeroDeVizinhos;
		this.medidaDeProximidade = medidaDeProximidade;
	}


	@Override
	protected void imprimeDadosEspecificos() {
		System.out.println("Número de vizinhos: " + numeroDeVizinhos);
		System.out.println("Medida de proximidade: " + medidaDeProximidade);
		System.out.println("Algoritmo: K-Vizinhos");
		
	}
	
	
}
