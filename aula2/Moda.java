package aula2;

public class Moda {
    public static void main(String[] args) {
        int[] vetor = {10, 25, 5,5, 3, 50 , 14, 11};

        int a = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] == vetor[j]){
                    a = vetor[i];
                    System.out.println(a);
                }
            }
        }
    }
}