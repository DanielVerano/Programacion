package tarea1_funciones;

public class Ejer10 {
    public static void main(String[] args) {
//        Calcular si dos números son amigos. Dos números son amigos
//        si la suma de los divisores propios (distinto de él mismo)
//        del primer número es igual al segundo número, y viceversa.
        System.out.println(sonAmigos(220,284));
        System.out.println(sonAmigos(1184,1210));
    }

    public static boolean sonAmigos(int a, int b) {
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                suma1 += i;
            }
        }

        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                suma2 += i;
            }
        }

        return suma1 == b && suma2 == a;
    }
}
