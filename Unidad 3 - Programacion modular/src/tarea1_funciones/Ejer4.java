package tarea1_funciones;

public class Ejer4 {
    public static void main(String[] args) {
        System.out.println(devuelveMayor(5,6));
    }

    public static int devuelveMayor(int a, int b) {
        if (a < b) {
            return b;
        }
        return a;
    }
}
