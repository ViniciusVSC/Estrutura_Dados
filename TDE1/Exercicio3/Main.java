package TDE1.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaMerge lista1 = new ListaEncadeadaMerge();
        ListaEncadeadaMerge lista2 = new ListaEncadeadaMerge();

        lista1.add(12);
        lista1.add(35);
        lista1.add(52);
        lista1.add(64);

        lista2.add(5);
        lista2.add(15);
        lista2.add(23);
        lista2.add(55);
        lista2.add(75);

        // Conecte o final da lista1 ao início da lista2
        Node ultimoLista1 = lista1.getLista();
        while (ultimoLista1.getProximo() != null) {
            ultimoLista1 = ultimoLista1.getProximo();
        }
        ultimoLista1.setProximo(lista2.getLista());

        ListaEncadeadaMerge.ordenar(lista1);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir na Lista Resultante");
            System.out.println("2 - Remover da Lista Resultante");
            System.out.println("3 - Listar Lista Resultante");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor a ser inserido na Lista Resultante: ");
                    int valorInserir = scanner.nextInt();
                    lista1.add(valorInserir);
                    ListaEncadeadaMerge.ordenar(lista1);
                }
                case 2 -> {
                    System.out.print("Digite o valor a ser removido da Lista Resultante: ");
                    int valorRemover = scanner.nextInt();
                    lista1.remove(valorRemover);
                }
                case 3 -> {
                    System.out.println("Lista Resultante:");
                    lista1.imprimir();
                    System.out.println();
                }
                case 0 -> System.out.println("Saindo do programa.");
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

