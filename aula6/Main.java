package aula6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Inserir");
            System.out.println("2. Remover");
            System.out.println("3. Imprimir");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a ser inserido: ");
                    int elementoInserir = scanner.nextInt();
                    Node novoNode = new Node();
                    novoNode.inserir(elementoInserir, listaEncadeada);
                    break;
                case 2:
                    System.out.print("Digite o elemento a ser removido: ");
                    int elementoRemover = scanner.nextInt();
                    Node node = new Node();
                    node.remover(elementoRemover, listaEncadeada);
                    break;
                case 3:
                    listaEncadeada.imprimir();
                    break;
            }
        } while (opcao != 0);

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
