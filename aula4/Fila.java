package aula4;

public class Fila {
    private int dados[];
    private int primeiro;
    private int ultimo;
    private int tamanhoMaximo;

    public Fila(int tamanhoMaximo){
        this.tamanhoMaximo = tamanhoMaximo;
        this.dados = new int[tamanhoMaximo];
        this.primeiro = 0;
        this.ultimo = -1;
    }
    public boolean estaCheia() {

        return ultimo == tamanhoMaximo - 1;
    }

    public boolean estaVazia() {

         return ultimo == -1;
    }
    public void inserir(int elemento) {
        if (!estaCheia()) {
            ultimo++;
            dados[ultimo] = elemento;
            System.out.println("Elemento inserido: " + elemento);
        } else {
            System.out.println("A fila está cheia. Não é possível inserir.");
        }
    }
    public void remover() {
        if (!estaVazia()) {
            int elementoRemovido = dados[primeiro];
            // Desloque todos os elementos para a esquerda para remover o primeiro elemento
            for (int i = 0; i < ultimo; i++) {
                dados[i] = dados[i + 1];
            }
            ultimo--; // Atualize o índice do último
            System.out.println("Elemento removido: " + elementoRemovido);
        } else {
            System.out.println("A fila está vazia. Não é possível remover.");
        }
    }


    public void imprimir() {
        System.out.print("Conteúdo da fila: ");
        for (int i = 0; i <= ultimo; i++) {
            System.out.print(dados[i] + " ");
        }
    }
}
