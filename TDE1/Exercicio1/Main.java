package TDE1.Exercicio1;

import TDE1.Exercicio1.ListaEncadeadaPilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeadaPilha pilha = new ListaEncadeadaPilha();

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Imprimir a Pilha");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o elemento a ser inserido: ");
                    int elementToPush = scanner.nextInt();
                    pilha.add(elementToPush);
                    System.out.println("Elemento inserido.");
                }
                case 2 -> {
                    if (!pilha.vazia()) {
                        int elementoDesempilhado = pilha.topo();
                        pilha.remove();
                        System.out.println("Elemento removido: " + elementoDesempilhado);
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                }
                case 3 -> pilha.imprimir();

                case 4 -> System.out.println("Saindo do programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
