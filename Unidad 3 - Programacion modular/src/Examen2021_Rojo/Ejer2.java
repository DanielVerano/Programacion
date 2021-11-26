package Examen2021_Rojo;

public class Ejer2 {
    public static void main(String[] args) {
        int[] a = new int[]{};
        int[] b = new int[]{8};
        int[] c = new int[]{6, 2, 5, 0, 1};
        System.out.println(convierteArrayEnString(a));
        System.out.println(convierteArrayEnString(b));
        System.out.println(convierteArrayEnString(c));
    }

    public static String convierteArrayEnString(int[] a) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            resultado.append(a[i]);
        }
        return resultado.toString();
    }
}
