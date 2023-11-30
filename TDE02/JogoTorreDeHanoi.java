package TDE02;
import java.util.Random;
import java.util.Scanner;

public class JogoTorreDeHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (mínimo 3): ");
        int quantidadeNumeros = scanner.nextInt();

        if (quantidadeNumeros < 3) {
            System.out.println("A quantidade mínima de números é 3. O jogo será encerrado.");
            return;
        }

        System.out.println("Escolha a ordem dos números:");
        System.out.println("1 - Crescente");
        System.out.println("2 - Decrescente");
        int ordem = scanner.nextInt();

        if (ordem != 1 && ordem != 2) {
            System.out.println("Opção inválida. O jogo será encerrado.");
            return;
        }

        boolean crescente = ordem == 1;

        ListaEncadeadaPilha pilha1 = new ListaEncadeadaPilha();
        ListaEncadeadaPilha pilha2 = new ListaEncadeadaPilha();
        ListaEncadeadaPilha pilha3 = new ListaEncadeadaPilha();
        Random random = new Random();

        int[] numeros = new int[quantidadeNumeros];
        boolean[] numerosUsados = new boolean[101];

        for (int i = 0; i < quantidadeNumeros; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(100) + 1;
            } while (numerosUsados[numeroAleatorio]);

            numeros[i] = numeroAleatorio;
            numerosUsados[numeroAleatorio] = true;
        }

        if (ordem == 1) {
            for (int i = 0; i < quantidadeNumeros - 1; i++) {
                for (int j = i + 1; j < quantidadeNumeros; j++) {
                    if (numeros[i] > numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < quantidadeNumeros - 1; i++) {
                for (int j = i + 1; j < quantidadeNumeros; j++) {
                    if (numeros[i] < numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
        }

        for (int i : numeros) {
            pilha1.add(i);
        }

        int opcao;
        boolean venceu = false;
        int jogadas = 0;

        do {
            System.out.println("Estado atual das pilhas:");
            System.out.println("Pilha 1:");
            pilha1.imprimir();
            System.out.println("Pilha 2:");
            pilha2.imprimir();
            System.out.println("Pilha 3:");
            pilha3.imprimir();

            if (pilha1.vazia() && pilha3.tamanho() == quantidadeNumeros) {
                venceu = true;
                break;
            }

            System.out.println("Opções:");
            System.out.println("0 - Sair do jogo");
            System.out.println("1 - Mover disco");
            System.out.println("2 - Resolver automaticamente");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a pilha de origem (1, 2 ou 3): ");
                int origemPilha = scanner.nextInt();

                System.out.print("Digite a pilha de destino (1, 2 ou 3): ");
                int destinoPilha = scanner.nextInt();

                moverDisco(origemPilha, destinoPilha, pilha1, pilha2, pilha3, crescente);
                jogadas++;

            } else if (opcao == 2) {
                System.out.println("Resolvendo automaticamente...");
                int movimentosAutomaticos = resolverTorreHanoi(quantidadeNumeros, 1, 3, 2, pilha1, pilha3, pilha2, crescente);
                System.out.println("Resolvido em " + movimentosAutomaticos + " movimentos.");
                break;

            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        if (venceu) {
            System.out.println("Parabéns! Você venceu o jogo em " + jogadas + " jogadas!");

        }

        scanner.close();
    }

    public static void moverDisco(int origemPilha, int destinoPilha, ListaEncadeadaPilha pilha1, ListaEncadeadaPilha pilha2, ListaEncadeadaPilha pilha3, boolean crescente) {
        ListaEncadeadaPilha origem;
        ListaEncadeadaPilha destino;

        switch (origemPilha) {
            case 1:
                origem = pilha1;
                break;
            case 2:
                origem = pilha2;
                break;
            case 3:
                origem = pilha3;
                break;
            default:
                System.out.println("Pilha de origem inválida.");
                return;
        }

        switch (destinoPilha) {
            case 1:
                destino = pilha1;
                break;
            case 2:
                destino = pilha2;
                break;
            case 3:
                destino = pilha3;
                break;
            default:
                System.out.println("Pilha de destino inválida.");
                return;
        }

        if (!origem.vazia()) {
            int discoOrigem = origem.topo();
            if (destino.vazia() || destino.topo() < discoOrigem && crescente){
                destino.add(discoOrigem);
                origem.remove();
                System.out.println("Movimento realizado.");
            } else if(destino.vazia() || destino.topo() > discoOrigem && !crescente) {
                destino.add(discoOrigem);
                origem.remove();
                System.out.println("Movimento realizado.");
            }
            else {
                System.out.println("Não é possível fazer esse movimento.");
            }
        } else {
            System.out.println("A pilha de origem está vazia.");
        }
    }

    public static void moverDiscoAuto(int origemPilha, int destinoPilha, ListaEncadeadaPilha pilhaOrigem, ListaEncadeadaPilha pilhaDestino, ListaEncadeadaPilha pilhaAuxiliar, boolean crescente) {
        ListaEncadeadaPilha origem;
        ListaEncadeadaPilha destino;

        switch (origemPilha) {
            case 1:
                origem = pilhaOrigem;
                break;
            case 2:
                origem = pilhaAuxiliar;
                break;
            case 3:
                origem = pilhaDestino;
                break;
            default:
                return; // Não faz nada se a pilha de origem for inválida
        }

        switch (destinoPilha) {
            case 1:
                destino = pilhaOrigem;
                break;
            case 2:
                destino = pilhaAuxiliar;
                break;
            case 3:
                destino = pilhaDestino;
                break;
            default:
                return; // Não faz nada se a pilha de destino for inválida
        }

        if (!origem.vazia()) {
            int discoOrigem = origem.topo();
            if (destino.vazia() || destino.topo() < discoOrigem && crescente) {
                destino.add(discoOrigem);
                origem.remove();
            } else if (destino.vazia() || destino.topo() > discoOrigem && !crescente) {
                destino.add(discoOrigem);
                origem.remove();
            }
        }
    }

    public static int resolverTorreHanoi(int quantidadeDiscos, int origem, int destino, int auxiliar, ListaEncadeadaPilha pilhaOrigem, ListaEncadeadaPilha pilhaDestino, ListaEncadeadaPilha pilhaAuxiliar, boolean crescente) {
        if (quantidadeDiscos == 1) {
            moverDiscoAuto(origem, destino, pilhaOrigem, pilhaDestino, pilhaAuxiliar, crescente);
            return 1;
        } else {
            int movimentos = 0;
            movimentos += resolverTorreHanoi(quantidadeDiscos - 1, origem, auxiliar, destino, pilhaOrigem, pilhaAuxiliar, pilhaDestino, crescente);
            moverDiscoAuto(origem, destino, pilhaOrigem, pilhaDestino, pilhaAuxiliar, crescente);
            movimentos += resolverTorreHanoi(quantidadeDiscos - 1, auxiliar, destino, origem, pilhaAuxiliar, pilhaDestino, pilhaOrigem, crescente);
            return movimentos + 1; // Adicionar 1 para contar o movimento atual
        }
    }
}