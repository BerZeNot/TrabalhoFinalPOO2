package br.com.trabalhofinal.model;

import br.com.trabalhofinal.model.Enum.EnumAvaliacao;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;

public class ApplicationFacade {
	private AlgoritmoIA algoritmo;
	
	public void fit() {
		carregaDados();
		normalizaDados();
		algoritmo.fit();
		System.out.println("Avaliando modelo...");
		EnumAvaliacao desempenho = algoritmo.avaliaModelo();
		switch (desempenho) {
		case INSATISFATORIO:
			System.out.println("O desempenho do modelo é INSATISFATORIO. Retornando modelo para modo UNFITTED");
			break;
		case REGULAR:
			System.out.println("O desempenho do modelo é REGULAR. Entrando no modo ITERFIT");
			break;
		
		// Default será no caso de BOM ou MUITO_BOM
		default:
			System.out.println("O modelo é " + desempenho + ". Permanecerá no modo FITTED");
			break;
		}
		
	}
	public void predict() {
		System.out.println("Recebendo novo dado..");
		System.out.println("Carredando o modelo de aprendizado ajustado anteriormente...");
		System.out.println("Predizendo o valor..");
		
		System.out.print("Valor Predito: ");
		
		if(algoritmo.getTipoTarefa().equals(EnumTipoTarefa.CLASSIFICACAO)) {
			Integer valorPredito = Integer.parseInt(algoritmo.predict());
			System.out.println(valorPredito + "\n");
		} else {
			Double valorPredito = Double.parseDouble(algoritmo.predict());
			System.out.println(valorPredito + "\n");
		}
	}
	public void imprimeModelo() {
		algoritmo.imprimeModelo();
	}
	
	
	private void carregaDados() {
		System.out.println("Carregando dados...");
	}
	
	private void normalizaDados() {
		System.out.println("Normalizando dados...");
	}
}
