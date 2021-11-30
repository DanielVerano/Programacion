package Examen2021_Azul;

public class Ejer4 {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {35,72,24,45,42,60},
                {32,42,64,23,41,39},
                {98,45,94,11,18,48},
                {12,34,56,78,90,12}};
        System.out.println(nEsimo(a,0));
        System.out.println(nEsimo(a,2));
        System.out.println(nEsimo(a,5));
        System.out.println(nEsimo(a,6));
        System.out.println(nEsimo(a,21));
        System.out.println(nEsimo(a,23));
        System.out.println(nEsimo(a,24));
        System.out.println(nEsimo(a,100));
    }

    public static int nEsimo(int[][] n, int posicion) {
        int cont = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (cont == posicion) {
                    return n[i][j];
                }
                cont++;
            }
        }
        return -1;
    }
}
