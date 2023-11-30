package TDE1.Exercicio1;

public class ListaEncadeadaPilha {
    private Node topo;

    public ListaEncadeadaPilha() {
        this.topo = null;
    }

    public Node getTopo() {
        return topo;
    }

    public void add(int i) {
        Node node = new Node();
        node.setInformacao(i);
        node.setProximo(topo);
        topo = node;
    }

    public void remove() {
        if (topo != null) {
            topo = topo.getProximo();
        }
    }

    public int topo() {
        if (topo != null) {
            return topo.getInformacao();
        } else {
            return -1;
        }
    }
    public void imprimir() {
        Node temp = topo;
        while (temp != null) {
            System.out.println(temp.getInformacao());
            temp = temp.getProximo();
        }
    }


    public boolean vazia() {
        return topo == null;
    }
}
