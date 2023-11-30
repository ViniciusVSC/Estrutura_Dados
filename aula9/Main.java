package aula9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        int escolha;

        int[] dados = {14, 15, 4, 9, 7, 18, 3, 5, 16, 4, 20, 17, 9, 14, 5};

        for (int valor : dados) {
            arvoreBinaria.inserir(valor);
        }

        do {
            System.out.println("Menu:");
            System.out.println("1 Inserir número");
            System.out.println("2 Imprimir árvore binária");
            System.out.println("3 imprimir em preOrdem, emOrdem e posOrdem");
            System.out.println("4 Remover o maior elemento");
            System.out.println("5 Remover o menor elemento");
            System.out.println("6 Escolha um numero para remover");
            System.out.println("7 Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o número que deseja inserir: ");
                    int numero = scanner.nextInt();
                    arvoreBinaria.inserir(numero);
                    break;
                case 2:
                    System.out.print("Árvore binária: ");
                    arvoreBinaria.imprimirArvore();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("preOrdem:");
                    arvoreBinaria.imprimirPreOrdem();
                    System.out.println();

                    System.out.println("emOrdem:");
                    arvoreBinaria.imprimirEmOrdem();
                    System.out.println();

                    System.out.println("posOrdem:");
                    arvoreBinaria.imprimirPosOrdem();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Removendo o maior elemento");
                    arvoreBinaria.raiz = Remover.removerMaiorElemento(arvoreBinaria.raiz);
                    break;
                case 5:
                    System.out.println("Removendo o menor elemento");
                    arvoreBinaria.raiz = Remover.removerMenorElemento(arvoreBinaria.raiz);
                    break;
                case 6:
                    System.out.print("Digite o número que deseja remover: ");
                    int numeroARemover = scanner.nextInt();
                    arvoreBinaria.raiz = Remover.removerElemento(arvoreBinaria.raiz, numeroARemover);
                    break;

                case 7:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 7);
    }
}
