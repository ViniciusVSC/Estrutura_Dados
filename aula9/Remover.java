package aula9;

public class Remover {
    // Método para remover o maior elemento de uma árvore binária de busca
    public static Node removerMaiorElemento(Node raiz) {
        if (raiz == null) {
            System.out.println("A árvore está vazia. Não há elementos para remover.");
            return null;
        }

        Node paiDoMaior = null;
        Node maior = raiz;

        while (maior.getDireita() != null) {
            paiDoMaior = maior;
            maior = maior.getDireita();
        }

        if (paiDoMaior == null) {
            raiz = maior.getEsquerda();
        } else {
            paiDoMaior.setDireita(maior.getEsquerda());
        }

        System.out.println("Maior elemento removido: " + maior.getInfo());

        return raiz;
    }

    // Método para remover o menor elemento de uma árvore binária de busca
    public static Node removerMenorElemento(Node raiz) {
        if (raiz == null) {
            System.out.println("A árvore está vazia. Não há elementos para remover.");
            return null;
        }

        Node paiDoMenor = null;
        Node menor = raiz;

        while (menor.getEsquerda() != null) {
            paiDoMenor = menor;
            menor = menor.getEsquerda();
        }

        if (paiDoMenor == null) {
            raiz = menor.getEsquerda();
        } else {
            paiDoMenor.setEsquerda(menor.getDireita());
        }

        System.out.println("Menor elemento removido: " + menor.getInfo());

        return raiz;
    }
    //Método para remover um numero expecifico
    public static Node removerElemento(Node raiz, int valor) {
        if (raiz == null) {
            System.out.println("A árvore está vazia. Não há elementos para remover.");
            return null;
        }

        if (valor < raiz.getInfo()) {
            raiz.setEsquerda(removerElemento(raiz.getEsquerda(), valor));
        } else if (valor > raiz.getInfo()) {
            raiz.setDireita(removerElemento(raiz.getDireita(), valor));
        } else {
            if (raiz.getEsquerda() == null) {
                return raiz.getDireita();
            } else if (raiz.getDireita() == null) {
                return raiz.getEsquerda();
            }

            raiz.setInfo(minValue(raiz.getDireita()));
            raiz.setDireita(removerElemento(raiz.getDireita(), raiz.getInfo()));
        }

        return raiz;
    }

    private static int minValue(Node node) {
        int minv = node.getInfo();
        while (node.getEsquerda() != null) {
            minv = node.getEsquerda().getInfo();
            node = node.getEsquerda();
        }
        return minv;
    }
}