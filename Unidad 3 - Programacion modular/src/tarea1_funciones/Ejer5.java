package tarea1_funciones;

public class Ejer5 {
    public static void main(String[] args) {
        System.out.println(devuelveMayor(5,-6,2));
        System.out.println(devuelveMayor(15,63,23));
    }

    public static int devuelveMayor(int a, int b) {
        if (a < b) {
            return b;
        }
        return a;
    }

    public static int devuelveMayor(int a, int b, int c) {
        int n1 = devuelveMayor(a,b);
        return devuelveMayor(n1, c);
    }
}
