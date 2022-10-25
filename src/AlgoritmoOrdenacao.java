import java.util.Random;

public class AlgoritmoOrdenacao {
	
	Random gerador = new Random();
	
	/**
     * Cria um array com numeros aleatórios
     */
	public int[] gerarArrayRandom(int faixaInicial, int faixaFinal, int qtsElementos) {
		int[] listaMerge = new int[qtsElementos];

		for (int i = 0; i < listaMerge.length; i++) {
			listaMerge[i] = gerador.nextInt(faixaInicial, faixaFinal);
		}
		return listaMerge;
	}

}
