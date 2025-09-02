public class Ordenacao {

    // Bubble Sort Crescente
    public static void bubbleSortCrescente(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Bubble Sort Decrescente
    public static void bubbleSortDecrescente(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Crescente
    public static void selectionSortCrescente(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
        }
    }

    // Selection Sort Decrescente
    public static void selectionSortDecrescente(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int maior = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] > vetor[maior]) {
                    maior = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = temp;
        }
    }

    // Insertion Sort Crescente
    public static void insertionSortCrescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    // Insertion Sort Decrescente
    public static void insertionSortDecrescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    // Método main só para testar
    public static void main(String[] args) {
        int[] numeros = { 5, 2, 9, 1, 7 };

        System.out.println("Vetor original:");
        for (int n : numeros) System.out.print(n + " ");

        bubbleSortCrescente(numeros);
        System.out.println("\n\nBubble Sort Crescente:");
        for (int n : numeros) System.out.print(n + " ");

        bubbleSortDecrescente(numeros);
        System.out.println("\n\nBubble Sort Decrescente:");
        for (int n : numeros) System.out.print(n + " ");
    }
}
