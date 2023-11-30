package aula9;

public class ArvoreBinaria {
    Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int numero) {
        raiz = inserirRecursivamente(raiz, numero);
    }

    //Metodo para inserir na árvore
    private Node inserirRecursivamente(Node raizAtual, int numero) {
        if (raizAtual == null) {
            return new Node(numero);
        }
        if (numero >= raizAtual.getInfo()) {
            raizAtual.setDireita(inserirRecursivamente(raizAtual.getDireita(), numero));
        }
        else {
            raizAtual.setEsquerda(inserirRecursivamente(raizAtual.getEsquerda(), numero));
        }
        return raizAtual;
    }

    // Método para imprimir a árvore em pré-ordem
    public void imprimirPreOrdem() {
        imprimirPreOrdemRecursivamente(raiz);
    }

    private void imprimirPreOrdemRecursivamente(Node raizAtual) {
        if (raizAtual != null) {
            System.out.print(raizAtual.getInfo() + " ");
            imprimirPreOrdemRecursivamente(raizAtual.getEsquerda());
            imprimirPreOrdemRecursivamente(raizAtual.getDireita());
        }
    }

    // Método para imprimir a árvore em ordem
    public void imprimirEmOrdem() {
        imprimirEmOrdemRecursivamente(raiz);
    }

    private void imprimirEmOrdemRecursivamente(Node raizAtual) {
        if (raizAtual != null) {
            imprimirEmOrdemRecursivamente(raizAtual.getEsquerda());
            System.out.print(raizAtual.getInfo() + " ");
            imprimirEmOrdemRecursivamente(raizAtual.getDireita());
        }
    }

    // Método para imprimir a árvore em pós-ordem
    public void imprimirPosOrdem() {
        imprimirPosOrdemRecursivamente(raiz);
    }

    private void imprimirPosOrdemRecursivamente(Node raizAtual) {
        if (raizAtual != null) {
            imprimirPosOrdemRecursivamente(raizAtual.getEsquerda());
            imprimirPosOrdemRecursivamente(raizAtual.getDireita());
            System.out.print(raizAtual.getInfo() + " ");
        }
    }

    // Método para imprimir a árvore no formato original
    public void imprimirArvore() {
        imprimirArvoreRecursivamente(raiz);
    }

    private void imprimirArvoreRecursivamente(Node raizAtual) {
        if (raizAtual != null) {
            System.out.print(raizAtual.getInfo() + " ");
            imprimirArvoreRecursivamente(raizAtual.getEsquerda());
            imprimirArvoreRecursivamente(raizAtual.getDireita());
        }
    }
}
