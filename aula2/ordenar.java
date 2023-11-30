package aula2;

class ordenar {
    public static void main(String[] args) {
        int[] vetor = {10, 25, 5, 3, 50, 14};

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            } 
        }

        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
