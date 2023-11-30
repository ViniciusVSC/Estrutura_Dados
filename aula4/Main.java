package aula4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho máximo da fila: ");
        int tamanhoMaximo = scanner.nextInt();
        Fila fila = new Fila(tamanhoMaximo);

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
                    int elemento = scanner.nextInt();
                    fila.inserir(elemento);
                    break;
                case 2:
                    fila.remover();
                    break;
                case 3:
                    fila.imprimir();
                    break;

            }
        }while (opcao != 0) ;

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
