package aula9;

public class Node {
    private Node esquerda;
    private int info;
    private Node direita;

    public Node(int info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }

    public int getInfo() {
        return info;
    }

    public void setDireita(Node node) {
        this.direita = node;
    }

    public Node getDireita() {
        return direita;
    }

    public void setEsquerda(Node node) {
        this.esquerda = node;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setInfo(int i) {
    }
}
