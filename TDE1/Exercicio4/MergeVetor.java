package TDE1.Exercicio4;

public class MergeVetor {
    private int[] vetorC;

    public MergeVetor(int[] vetorA, int[] vetorB) {
        vetorC = new int[vetorA.length + vetorB.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[i + vetorA.length] = vetorB[i];
        }

        for (int i = 0; i < vetorC.length - 1; i++) {
            for (int j = i + 1; j < vetorC.length; j++) {
                if (vetorC[j] < vetorC[i]) {
                    int temp = vetorC[i];
                    vetorC[i] = vetorC[j];
                    vetorC[j] = temp;
                }
            }
        }
    }

    public void inserirElemento(int elemento) {
        int tamanho = vetorC.length + 1;
        int[] novoVetor = new int[tamanho];

        for (int i = 0; i < vetorC.length; i++) {
            novoVetor[i] = vetorC[i];
        }

        novoVetor[tamanho - 1] = elemento;
        vetorC = novoVetor;

        for (int a = 0; a < vetorC.length - 1; a++) {
            for (int z = a + 1; z < vetorC.length; z++) {
                if (vetorC[z] < vetorC[a]) {
                    int temp = vetorC[a];
                    vetorC[a] = vetorC[z];
                    vetorC[z] = temp;
                }
            }
        }
    }
    public void removerElemento(int elemento) {
        int tamanho = vetorC.length;
        int[] novoVetor = new int[tamanho - 1];
        int j = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetorC[i] != elemento) {
                novoVetor[j++] = vetorC[i];
            }
        }

        vetorC = novoVetor;

        System.out.println("Removendo o numero:" + " " + elemento);

        for (int b = 0; b < vetorC.length - 1; b++) {
            for (int x = b + 1; x < vetorC.length; x++) {
                if (vetorC[x] < vetorC[b]) {
                    int temp = vetorC[b];
                    vetorC[b] = vetorC[x];
                    vetorC[x] = temp;
                }
            }
        }
    }
    public int[] getVetorC() {
        return vetorC;
    }
}
