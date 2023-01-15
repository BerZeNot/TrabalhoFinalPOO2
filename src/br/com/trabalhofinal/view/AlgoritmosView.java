package br.com.trabalhofinal.view;

import java.util.Scanner;

import br.com.trabalhofinal.model.AlgoritmoIA;
import br.com.trabalhofinal.model.ApplicationFacade;
import br.com.trabalhofinal.model.ArvoreDeDecisao;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;

public class AlgoritmosView{

    public AlgoritmosView (){
        
    }

    public void menu(){
        int opcaoAlgoritmo;
        System.out.println("Escolha um Algoritmo: ");
        System.out.println("1) Arvore de decisão");
        System.out.println("2) KVizinhos");
        System.out.println("3) Rede Neural Artificial");
        Scanner sc = new Scanner(System.in);
        opcaoAlgoritmo = sc.nextInt();

        switch (opcaoAlgoritmo) {
            case 1:{
                ApplicationFacade facade = iniciaArvoreDecisao();
                acao(facade);
                limparConsole();
                menu();
                break;
            }
            
            case 2:{
                
                menu();
                break;
            } 

            case 3:{
                
                menu();
                break;
            }
            case 0:{
                break;
            }
        }
    }

    public ApplicationFacade iniciaArvoreDecisao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de Tarefa: ");
        System.out.println("1) Classificação");
        System.out.println("2) Regressão");
        Integer tipoTarefa = sc.nextInt();

        System.out.println("Número de Árvores: ");
        Integer numeroArvores = sc.nextInt();
        
        System.out.println("Medida de Informação: ");
        Double medidaInformacao = sc.nextDouble();
        AlgoritmoIA algoritmoIA = new ArvoreDeDecisao(EnumTipoTarefa.values()[tipoTarefa-1], numeroArvores, medidaInformacao);
        ApplicationFacade facade = new ApplicationFacade(algoritmoIA);
        limparConsole();
        return facade;
    }

    public void acao(ApplicationFacade facade){
        Integer acao = 1;
        while(acao != 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha uma ação: ");
            System.out.println("1) Fit");
            System.out.println("2) Predict");
            System.out.println("3) Imprimir Modelo");
            System.out.println("0) Menu");
            acao = sc.nextInt();
    
            switch(acao){
                case(1):{
                    facade.fit();
                }
    
                case(2):{
                    facade.predict();
                }
    
                case(3):{
                    facade.imprimeModelo();
                }
            }
        }
    }

    public static void limparConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
