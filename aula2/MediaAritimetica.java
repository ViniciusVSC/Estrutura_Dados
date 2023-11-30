package aula2;

public class MediaAritimetica {
    public static void main( String[] args ){

        double[ ] vetor = {10,25,5,3,50,14};
        double r = 0;

        for(int i = 0; i < vetor.length; i++){
            double j = vetor[i];
            r = j + r;
        }
        System.out.println(r / vetor.length);
    }
}
