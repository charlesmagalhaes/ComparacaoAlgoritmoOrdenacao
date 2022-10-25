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
	
	public static void imprimirArray(int[] lista, String tituloLista) {
		 System.out.print(tituloLista);
	        for (int i = 0; i < lista.length; ++i)
	            System.out.print(lista[i] + " ");
	  
	        System.out.println();
		
	}
	
	public void insertionSort(int[] lista) {
		int key;
		int i;
		for(int j=1; j< lista.length;j++) {
			key = lista[j];
			i = j -1;
			
			while (i >= 0  && lista[i] > key) {
				lista[i+1] = lista[i];
				i = i -1;
			}
			lista[i+1] = key;
		}
	}
		
		public void insertionSortDesc(int[] lista) {
			int key;
			int i;
			for(int j=1; j< lista.length;j++) {
				key = lista[j];
				i = j -1;
				
				while (i >= 0  && lista[i] < key) {
					lista[i+1] = lista[i];
					i = i -1;
				}
				lista[i+1] = key;
			}
		
	}
		
		public int[] bubbleSort (int[] lista){
			int aux = 0;
			
			for(int i=0; i< lista.length; i++) {
				for(int j=0;j<lista.length-1; j++) {
					if(lista[j] > lista[j + 1]){
						aux = lista[j];
						lista[j] = lista[j+1];
						lista[j+1] = aux;
					}
				}
				
			}
			return lista;
			
		}
		
		
		public void merge(int[] lista, int l, int m, int r)
	    {
	        
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	      
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	 
	       
	        for (int i = 0; i < n1; ++i)
	            L[i] = lista[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = lista[m + 1 + j];
	 
	      
	        int i = 0, j = 0;
	 
	      
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	            	lista[k] = L[i];
	                i++;
	            }
	            else {
	            	lista[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	      
	        while (i < n1) {
	        	lista[k] = L[i];
	            i++;
	            k++;
	        }
	 
	       
	        while (j < n2) {
	        	lista[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	 
	   
	   public void sort(int[] lista, int l, int r)
	    {
	        if (l < r) {
	           
	            int m = l + (r - l) / 2;
	 
	            sort(lista, l, m);
	            sort(lista, m + 1, r);
	 
	           merge(lista, l, m, r);
	        }
			
	    }
	   
	   public void mergeOtimizado(int[] lista, int l, int r) {
		   if(lista.length > 1000)
			   sort(lista, l, r);
		   else
			   insertionSort(lista);
		   
	   }

}
