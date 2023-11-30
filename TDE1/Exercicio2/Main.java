package TDE1.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeadaFila fila = new ListaEncadeadaFila();

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir elemento na fila");
            System.out.println("2. Remover elemento da fila");
            System.out.println("3. Imprimir a fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o elemento a ser inserido: ");
                    int elementToEnqueue = scanner.nextInt();
                    fila.enfileirar(elementToEnqueue);
                    System.out.println("Elemento inserido.");
                }
                case 2 -> {
                    if (!fila.vazia()) {
                        int elementoDesenfileirado = fila.inicio();
                        fila.desenfileirar();
                        System.out.println("Elemento removido: " + elementoDesenfileirado);
                    } else {
                        System.out.println("A fila está vazia.");
                    }
                }
                case 3 -> fila.imprimir();

                case 4 -> System.out.println("Saindo do programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
