package aula6;

public class ListaEncadeada {
    private Node Lista;

    public ListaEncadeada() {
        Lista = null;
    }

    public Node getLista() {
        return Lista;
    }

    public void setLista(Node lista) {
        Lista = lista;
    }

    public void imprimir() {
        Node atual = Lista;
        while (atual != null) {
            System.out.print(atual.getInformacao() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
