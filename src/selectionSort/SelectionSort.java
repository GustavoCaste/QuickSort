package selectionSort;


	import java.util.Random;

	public class SelectionSort {
	    public static void main(String[] args) {

//	        vetorMilRodando();

//	       vetorDezMilRodando();

	        vetorCemMilRodando();

	    }

	    public static void vetorMilRodando() {
	        Random random = new Random();
	        int numComparacoesChaves = 0;
	        int numMovimentacoesRegistro = 0;

	        int[] vetorMil = new int[1000];

	        int quantidadeEmbaralhar = (int) (vetorMil.length * 0.1);


	        //Preencher vetor aleatoriamente
//	        for (int i = 0; i < vetorMil.length; i++) {
//	            vetorMil[i] = (int) (Math.random() * vetorMil.length);
	//
//	        }

	        //Preencher vetor inversamente ordenado
//	        for (int i = 0, j = vetorMil.length; i < vetorMil.length; i++, j--) {
//	            vetorMil[i] = j;
	//
//	        }


	        //Preencher vetor na ordem
	        for (int i = 0; i < vetorMil.length; i++) {
	            vetorMil[i] = i;
	        }
	        //Embaralhar 10% do vetor
	        for (int i = 0; i < quantidadeEmbaralhar; i++) {
	            int indiceAtual = i;
	            int indiceAleatorio = random.nextInt(vetorMil.length);

	            int temp = vetorMil[indiceAtual];
	            vetorMil[indiceAtual] = vetorMil[indiceAleatorio];
	            vetorMil[indiceAleatorio] = temp;

	        }


	        // Desordenado
	        System.out.println("Desordenado: ");
	        for (int i = 0; i < vetorMil.length; i++) {

	            System.out.print(vetorMil[i] + ", ");

	        }
	        System.out.println("");


	        //SelectionSort
	        int posicaoMenor;
	        int aux;
	        for (int i = 0; i < vetorMil.length; i++) {
	            posicaoMenor = i;
	            for (int j = i + 1; j < vetorMil.length; j++) {
	                numComparacoesChaves++;
	                if (vetorMil[posicaoMenor] > vetorMil[j]) {
	                    numMovimentacoesRegistro++;
	                    posicaoMenor = j;
	                }

	            }
	            //Trocando os valores de lugar

	            aux = vetorMil[posicaoMenor];
	            vetorMil[posicaoMenor] = vetorMil[i];
	            vetorMil[i] = aux;

	        }
	        System.out.println("");


	        // Desordenado
	        System.out.println("Ordenado: ");
	        for (int i = 0; i < vetorMil.length; i++) {

	            System.out.print(vetorMil[i] + ", ");
	        }
	        System.out.println("");
	        System.out.println("Numero de comparações de chaves: " + numComparacoesChaves);
	        System.out.println("Numero de movimentações de registros: " + numMovimentacoesRegistro);

	    }


	    public static void vetorDezMilRodando() {
	        Random random = new Random();
	        int numComparacoesChaves = 0;
	        int numMovimentacoesRegistro = 0;

	        int[] vetorDezMil = new int[10000];

	        int quantidadeEmbaralhar = (int) (vetorDezMil.length * 0.1);
	        //Preencher vetor aleatoriamente
//	        for (int i = 0; i < vetorDezMil.length; i++) {
//	            vetorDezMil[i] = (int) (Math.random() * vetorDezMil.length);
	//
//	        }

	        //Preencher vetor inversamente ordenado
//	        for (int i = 0, j = vetorDezMil.length; i < vetorDezMil.length; i++, j--) {
//	            vetorDezMil[i] = j;
	//
//	        }

	        //Preencher vetor na ordem
	        for (int i = 0; i < vetorDezMil.length; i++) {
	            vetorDezMil[i] = i;
	        }
	        //Embaralhar 10% do vetor
	        for (int i = 0; i < quantidadeEmbaralhar; i++) {
	            int indiceAtual = i;
	            int indiceAleatorio = random.nextInt(vetorDezMil.length);

	            int temp = vetorDezMil[indiceAtual];
	            vetorDezMil[indiceAtual] = vetorDezMil[indiceAleatorio];
	            vetorDezMil[indiceAleatorio] = temp;

	        }


	        // Desordenado
	        System.out.println("Desordenado: ");
	        for (int i = 0; i < vetorDezMil.length; i++) {

	            System.out.print(vetorDezMil[i] + ", ");

	        }
	        System.out.println("");


	        //SelectionSort
	        int posicaoMenor;
	        int aux;
	        for (int i = 0; i < vetorDezMil.length; i++) {
	            posicaoMenor = i;
	            for (int j = i + 1; j < vetorDezMil.length; j++) {
	                numComparacoesChaves++;
	                if (vetorDezMil[posicaoMenor] > vetorDezMil[j]) {
	                    numMovimentacoesRegistro++;
	                    posicaoMenor = j;
	                }

	            }
	            //Trocando os valores de lugar

	            aux = vetorDezMil[posicaoMenor];
	            vetorDezMil[posicaoMenor] = vetorDezMil[i];
	            vetorDezMil[i] = aux;

	        }
	        System.out.println("");


	        // Desordenado
	        System.out.println("Ordenado: ");
	        for (int i = 0; i < vetorDezMil.length; i++) {

	            System.out.print(vetorDezMil[i] + ", ");
	        }
	        System.out.println("");
	        System.out.println("Numero de comparações de chaves: " + numComparacoesChaves);
	        System.out.println("Numero de movimentações de registros: " + numMovimentacoesRegistro);
	    }

	    public static void vetorCemMilRodando() {
	        Random random = new Random();
	        int numComparacoesChaves = 0;
	        int numMovimentacoesRegistro = 0;

	        int[] vetorCemMil = new int[100000];
	        int quantidadeEmbaralhar = (int) (vetorCemMil.length * 0.1);

	        //Preencher vetor aleatoriamente
//	        for (int i = 0; i < vetorCemMil.length; i++) {
//	            vetorCemMil[i] = (int) (Math.random() * vetorCemMil.length);
	//
//	        }

	        //Preencher vetor inversamente ordenado
//	        for (int i = 0, j = vetorCemMil.length; i < vetorCemMil.length; i++, j--) {
//	            vetorCemMil[i] = j;
	//
//	        }
	        //Preencher vetor na ordem
	        for (int i = 0; i < vetorCemMil.length; i++) {
	            vetorCemMil[i] = i;
	        }
	        //Embaralhar 10% do vetor
	        for (int i = 0; i < quantidadeEmbaralhar; i++) {
	            int indiceAtual = i;
	            int indiceAleatorio = random.nextInt(vetorCemMil.length);

	            int temp = vetorCemMil[indiceAtual];
	            vetorCemMil[indiceAtual] = vetorCemMil[indiceAleatorio];
	            vetorCemMil[indiceAleatorio] = temp;

	        }


	        System.out.println("Desordenado: ");
	        for (int i = 0; i < vetorCemMil.length; i++) {

	            System.out.print(vetorCemMil[i] + ", ");

	        }
	        System.out.println("");


	        //SelectionSort
	        int posicaoMenor;
	        int aux;
	        for (int i = 0; i < vetorCemMil.length; i++) {
	            posicaoMenor = i;
	            for (int j = i + 1; j < vetorCemMil.length; j++) {
	                numComparacoesChaves++;
	                if (vetorCemMil[posicaoMenor] > vetorCemMil[j]) {
	                    numMovimentacoesRegistro++;
	                    posicaoMenor = j;
	                }

	            }
	            //Trocando os valores de lugar

	            aux = vetorCemMil[posicaoMenor];
	            vetorCemMil[posicaoMenor] = vetorCemMil[i];
	            vetorCemMil[i] = aux;

	        }
	        System.out.println("");


	        System.out.println("Ordenado: ");
	        for (int i = 0; i < vetorCemMil.length; i++) {

	            System.out.print(vetorCemMil[i] + ", ");
	        }
	        System.out.println("");
	        System.out.println("Numero de comparações de chaves: " + numComparacoesChaves);
	        System.out.println("Numero de movimentações de registros: " + numMovimentacoesRegistro);
	    }


	}

