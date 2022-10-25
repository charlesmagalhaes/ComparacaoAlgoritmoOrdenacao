import java.util.Random;

public class AplicacaoComparacaoOrdenacao {
	
	public static void main(String[] args) {
		
		AlgoritmoOrdenacao ordenacao = new AlgoritmoOrdenacao();
		
		Random gerador = new Random();
		
		int[] listaGerada = ordenacao.gerarArrayRandom(1, 10000, 500);
		
		AlgoritmoOrdenacao.imprimirArray(listaGerada, "Lista Gerada: ");
		
	}

}
