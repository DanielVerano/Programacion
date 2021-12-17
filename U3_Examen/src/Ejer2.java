import java.util.Arrays;

public class Ejer2 {
    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(insertarValor(v1, 8, 3)));
        System.out.println(Arrays.toString(insertarValor(v1, 8, 5)));
        System.out.println(Arrays.toString(insertarValor(v1, 8, 10)));
    }

    public static int[] insertarValor(int[] v, int valor, int posicion) {

        if (posicion >= 0 && posicion <= v.length) {
            int[] res = new int[v.length + 1];

            for (int i = 0; i < posicion; i++) {
                res[i] = v[i];
            }

            res[posicion] = valor;

            for (int i = posicion + 1; i < res.length; i++) {
                res[i] = v[i - 1];
            }

            return res;
        }

        return v;
    }
}
