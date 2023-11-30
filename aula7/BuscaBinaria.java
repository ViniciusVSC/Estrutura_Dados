package aula7;

public class BuscaBinaria {
    static int busca_binaria(int dado[], int x, int inf, int sup){
        int meio;
        if(inf > sup)
            return (-1);

        meio =(inf + sup)/2;

        if(x == dado[meio])
            return (meio);

        if(x < dado[meio])
            return busca_binaria(dado, x, inf, meio -1);

        else
            return busca_binaria(dado, x,meio + 1, sup);
    }
    public static void main(String[] args) {
        int[] dado = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(busca_binaria(dado,5,0,5));

    }
}
