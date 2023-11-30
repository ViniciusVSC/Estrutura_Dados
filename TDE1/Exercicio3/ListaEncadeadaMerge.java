package TDE1.Exercicio3;

public class ListaEncadeadaMerge {
    private Node Lista;
    public ListaEncadeadaMerge(){
        this.Lista = null;
    }

    public void setLista(Node lista) {
        Lista = lista;

    }

    public Node getLista() {
        return Lista;
    }

    public void add(int i) {
        Node node = new Node();
        node.setInformacao(i);

        if (Lista == null) {
            Lista = node;
        } else {
            Node ultimo = Lista;
            while (ultimo.getProximo() != null) {
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(node);
        }
    }

    public void imprimir(){
        for(Node n = Lista; n != null; n = n.getProximo()){
            System.out.println(n.getInformacao());
            }
        }
    public Node procurar(int i) {
        for (Node n = Lista; n != null; n = n.getProximo()) {
            if (n.getInformacao() == i) {
                return n;
            }
        }
        return null;
    }

    public void remove(int i){

        Node anterior = null;
        Node p = Lista;

        while(p != null && p.getInformacao() != i){
            anterior = p;
            p = p.getProximo();
            }

        if(p == null){
             return;
            }

        if(anterior == null){
            Lista = p.getProximo();
            } else {
            anterior.setProximo(p.getProximo());
            }
        }

    public static void ordenar(ListaEncadeadaMerge lista) {
        boolean trocou;
        do {
            Node atual = lista.getLista();
            Node anterior = null;
            trocou = false;

            while (atual != null && atual.getProximo() != null) {
                Node proximo = atual.getProximo();

                if (atual.getInformacao() > proximo.getInformacao()) {
                    // Troca os elementos
                    if (anterior == null) {
                        lista.setLista(proximo);
                    } else {
                        anterior.setProximo(proximo);
                    }
                    atual.setProximo(proximo.getProximo());
                    proximo.setProximo(atual);

                    trocou = true;
                }

                anterior = atual;
                atual = proximo;
            }
        } while (trocou);
    }
}

