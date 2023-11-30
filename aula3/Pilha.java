package aula3;

import java.util.Scanner;

class Pilha {
    private int tamanhoMaximo;
    private int[] dados;
    private int topo;

    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.dados = new int[tamanhoMaximo];
        this.topo = -1;
    }

    public boolean estaCheia() {
        return topo == tamanhoMaximo - 1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public void inserir(int elemento) {
        if (!estaCheia()) {
            topo++;
            dados[topo] = elemento;
            System.out.println("Elemento inserido: " + elemento);
        } else {
            System.out.println("A pilha está cheia. Não é possível inserir.");
        }
    }

    public void remover() {
        if (!estaVazia()) {
            int elementoRemovido = dados[topo];
            topo--;
            System.out.println("Elemento removido: " + elementoRemovido);
        } else {
            System.out.println("A pilha está vazia. Não é possível remover.");
        }
    }
    public void imprimir() {
        System.out.println("Conteúdo da pilha:");
        for (int i = 0; i <= topo; i++) {
            System.out.println(dados[i]);
        }
    }
}


