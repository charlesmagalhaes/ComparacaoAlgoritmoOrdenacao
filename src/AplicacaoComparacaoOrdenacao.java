import java.util.Random;

public class AplicacaoComparacaoOrdenacao {
	
	public static void main(String[] args) {
		
		AlgoritmoOrdenacao ordenacao = new AlgoritmoOrdenacao();
		int[] listaGerada;
		
		long tempoInicial;
		long somaInsertion = 0 ;
		long somaBubble = 0;
		long somaMerge = 0;
		
		for(int i=0; i< 5;i++) {
	
			listaGerada = ordenacao.gerarArrayRandom(1, 10000, 10000);
			
			 tempoInicial = System.currentTimeMillis();
			 ordenacao.insertionSort(listaGerada.clone());
			 somaInsertion += System.currentTimeMillis() - tempoInicial;
		     
		     tempoInicial = System.currentTimeMillis();
			 ordenacao.bubbleSort(listaGerada);
			 somaBubble += System.currentTimeMillis() - tempoInicial;
		     
		     int[] listaTeste = listaGerada.clone();
		     tempoInicial = System.currentTimeMillis();
			 ordenacao.sort(listaTeste, 0, listaTeste.length-1);
			 somaMerge += System.currentTimeMillis() - tempoInicial;
			
			
		}
		
		System.out.println("--------------Dados de entrada aleatório-------------------\n");
		System.out.println("Insertion sort time media: "+ somaInsertion/5);
		System.out.println("Bubble sort time media: "+ somaBubble/5);
		System.out.println("Merge sort time media: "+ somaMerge/5+"\n");
		
		
		
		
		for(int i=0; i< 5;i++) {
			
			listaGerada = ordenacao.gerarArrayRandom(1, 10000, 10000);
			ordenacao.insertionSort(listaGerada);
		
			 tempoInicial = System.currentTimeMillis();
			 ordenacao.insertionSort(listaGerada.clone());
			 somaInsertion += System.currentTimeMillis() - tempoInicial;
		     
		     tempoInicial = System.currentTimeMillis();
			 ordenacao.bubbleSort(listaGerada);
			 somaBubble += System.currentTimeMillis() - tempoInicial;
		     
		     int[] listaTeste = listaGerada.clone();
		     tempoInicial = System.currentTimeMillis();
			 ordenacao.sort(listaTeste, 0, listaTeste.length-1);
			 somaMerge += System.currentTimeMillis() - tempoInicial;
			
			
		}
		
		System.out.println("--------------Dados de entrada já ordenados-------------------\n");
		System.out.println("Insertion sort time media: "+ somaInsertion/5);
		System.out.println("Bubble sort time media: "+ somaBubble/5);
		System.out.println("Merge sort time media: "+ somaMerge/5);
		
		
		
		
		for(int i=0; i< 5;i++) {
			
			listaGerada = ordenacao.gerarArrayRandom(1, 10000, 10000);
			ordenacao.insertionSortDesc(listaGerada);
		
			 tempoInicial = System.currentTimeMillis();
			 ordenacao.insertionSort(listaGerada.clone());
			 somaInsertion += System.currentTimeMillis() - tempoInicial;
		     
		     tempoInicial = System.currentTimeMillis();
			 ordenacao.bubbleSort(listaGerada);
			 somaBubble += System.currentTimeMillis() - tempoInicial;
		     
		     int[] listaTeste = listaGerada.clone();
		     tempoInicial = System.currentTimeMillis();
			 ordenacao.sort(listaTeste, 0, listaTeste.length-1);
			 somaMerge += System.currentTimeMillis() - tempoInicial;
			
			
		}
		
		System.out.println("--------------Dados de entrada ordenados de forma decrescente-------------------\n");
		System.out.println("Insertion sort time media: "+ somaInsertion/5);
		System.out.println("Bubble sort time media: "+ somaBubble/5);
		System.out.println("Merge sort time media: "+ somaMerge/5);
		
		
	}
	
	
	

}
