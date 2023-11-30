package TDE1.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetorA = {1, 23, 74, 90, 99};
        int[] vetorB = {10, 30, 36, 67, 100};

        MergeVetor mergeVetor = new MergeVetor(vetorA, vetorB);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Imprimir vetor C");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o elemento a ser inserido:");
                    int elementoInserir = scanner.nextInt();
                    mergeVetor.inserirElemento(elementoInserir);
                    break;
                case 2:
                    System.out.println("Insira o elemento a ser removido:");
                    int elementoRemover = scanner.nextInt();
                    mergeVetor.removerElemento(elementoRemover);
                    break;
                case 3:
                    System.out.println("\nVetor C:");
                    int[] vetorC = mergeVetor.getVetorC();
                    for (int i = 0; i < vetorC.length; i++) {
                        System.out.print(vetorC[i]);
                        if (i < vetorC.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
