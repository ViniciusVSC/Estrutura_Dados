package TDE1.Exercicio3;

public class Node {
    private Integer informacao;
    private Node proximo;
    public Node(){
        informacao = null;
        proximo = null;
    }

    public int getInformacao(){
        return informacao;
    }

    public void setInformacao(int informacao){
        this.informacao = informacao;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
