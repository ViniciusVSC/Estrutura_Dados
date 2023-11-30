package aula5;

public class Node {
    private Integer informacao;
    private Node proximo;

    public Node() {
        informacao = null;
        proximo = null;
    }
    public int getInformacao() {

        return informacao;
    }
    public Node getProximo() {

        return proximo;
    }

    public void setInformacao(int i) {

        informacao = i;
    }

    public void setProximo(Node proximo) {

        this.proximo = proximo;
    }

    public void inserir(int i, ListaEncadeada lista) {
        Node novo = new Node();
        novo.setInformacao(i);
        novo.setProximo(lista.getLista());
        lista.setLista(novo);
    }
    public void remover(int i, ListaEncadeada lista) {
        Node atual = lista.getLista();
        Node anterior = null;

        while (atual != null && atual.getInformacao() != i) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null) {
            if (anterior != null) {
                anterior.setProximo(atual.getProximo());
            } else {
                lista.setLista(atual.getProximo());
            }
        }
    }
}