package quickSort;


public class QuickSort {
    private int comparacoes;
    private int trocas;

    public static void main(String[] args) {

        // Vetor 1, 10% aleatório e o resto ordenado
//        int vetor1[] = new int[1000];
//        for (int i = 0; i < 100; i++) {
//            vetor1[i] = (int) (Math.random() * 1000);
//        }
//        for (int j = 99; j < vetor1.length; j++) {
//            vetor1[j] = j;
//        }

        QuickSort sort = new QuickSort();
//        System.out.println("Vetor 1");
//        sort.ordenarVetorDeInteiros(vetor1);
//        imprimirVetor(vetor1);

        // Vetor 2, totalmente aleatório
//        int vetor2[] = new int[10000];
//        for (int i = 0; i < vetor2.length; i++) {
//            vetor2[i] = (int) (Math.random() * vetor2.length);
//        }
//
//        System.out.println("Vetor 2");
//        sort.ordenarVetorDeInteiros(vetor2);
//        imprimirVetor(vetor2);

        // Vetor 3, inversamente ordenado
        
        int[] arrayInverso = new int[10000];
        
        for (int i = 0; i < arrayInverso.length; i++) {
            arrayInverso[i] = i;
        }

        System.out.println("Vetor 3");
        sort.ordenarVetorInverso(arrayInverso);
        for (int i = 0; i < arrayInverso.length; i++) {
            System.out.print(arrayInverso[i]+ " ");
        }}
        
        
        
    

    public void ordenarVetorDeInteiros(int[] vetor) {
        comparacoes = 0;
        trocas = 0;
        quickSort(vetor, 0, vetor.length - 1);
        System.out.println("Número de comparações: " + comparacoes);
        System.out.println("Número de trocas: " + trocas);
    }

    private void quickSort(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {
            int indexPivo = dividir(vetor, inicio, fim);
            quickSort(vetor, inicio, indexPivo - 1);
            quickSort(vetor, indexPivo + 1, fim);
        }
    }

    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {
            comparacoes++;

            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
                comparacoes++;
            }

            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
                comparacoes++;
            }

            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
        trocas++;
    }

    public void ordenarVetorInverso(int[] vetor) {
        comparacoes = 0;
        trocas = 0;
        quickSortInverso(vetor, 0, vetor.length - 1);
        System.out.println("Número de comparações: " + comparacoes);
        System.out.println("Número de trocas: " + trocas);
    }

    private void quickSortInverso(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {
            int indexPivo = dividirInverso(vetor, inicio, fim);
            quickSortInverso(vetor, inicio, indexPivo - 1);
            quickSortInverso(vetor, indexPivo + 1, fim);
        }
    }
    private int dividirInverso(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {
            comparacoes++;

            while (pontEsq <= pontDir && vetor[pontEsq] >= pivo) {
                pontEsq++;
                comparacoes++;
            }

            while (pontDir >= pontEsq && vetor[pontDir] < pivo) {
                pontDir--;
                comparacoes++;
            }

            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}