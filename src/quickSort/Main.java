package quickSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanho = 1000;
		int vetor[] = new int[tamanho];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i + 1 ;
			
		}

			    QuickSort sort = new QuickSort();
			    sort.ordenarVetorDeInteiros(vetor);
			    imprimirVetor(vetor);
			  }

			  private static void imprimirVetor(int[] vetor) {
			    System.out.println("Vetor :\n");
			    for(int num : vetor) {
			      System.out.print(num + ", ");
			    }
			  
	}

}
