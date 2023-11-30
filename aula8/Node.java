package aula8;

public class Node {
    private Node esquerda;
    private Integer info;
    private Node direita;

    public Node(int info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }
}