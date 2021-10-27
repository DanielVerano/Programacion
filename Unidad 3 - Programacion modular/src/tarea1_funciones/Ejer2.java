package tarea1_funciones;

public class Ejer2 {
    public static void main(String[] args) {
        imprimirNumeros(1,10);
    }

    public static void imprimirNumeros(int a, int b) {
        int aux;

        if (b < a) {
            aux = b;
            b = a;
            a = aux;
        }
        for (int i = a+1; i < b; i++) {
            System.out.println(i);
        }
    }
}
