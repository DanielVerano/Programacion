package Examen2021_Azul;

public class Ejer1 {
    public static void main(String[] args) {
        int[] a = new int[]{111,222,333,444};
        int[] b = new int[]{52,37};

        System.out.println(aleatorioDeArray(a));
        System.out.println(aleatorioDeArray(b));
    }

    public static int aleatorioDeArray(int[] a) {
        int r = (int) (Math.random() * a.length);

        return a[r];
    }
}
