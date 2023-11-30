package TDE1.Exercicio2;

public class ListaEncadeadaFila {
    private Node inicio;
    private Node fim;

    public ListaEncadeadaFila() {
        this.inicio = null;
        this.fim = null;
    }

    public Node getInicio() {
        return inicio;
    }

    public void enfileirar(int i) {
        Node node = new Node();
        node.setInformacao(i);

        if (vazia()) {
            inicio = node;
            fim = node;
        } else {
            fim.setProximo(node);
            fim = node;
        }
    }

    public void desenfileirar() {
        if (!vazia()) {
            inicio = inicio.getProximo();
            if (inicio == null) {
                fim = null;
            }
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public int inicio() {
        if (!vazia()) {
            return inicio.getInformacao();
        } else {
            return -1;
        }
    }

    public void imprimir() {
        Node temp = inicio;
        while (temp != null) {
            System.out.println(temp.getInformacao());
            temp = temp.getProximo();
        }
    }

    public boolean vazia() {
        return inicio == null;
    }
}